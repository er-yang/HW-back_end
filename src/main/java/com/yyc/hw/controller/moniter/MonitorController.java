package com.yyc.hw.controller.moniter;

import com.yyc.hw.entity.MonitorAssign;
import com.yyc.hw.entity.MonitorCenter;
import com.yyc.hw.entity.MonitorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MonitorController {
    @Autowired
    private IMonitorRepository monitorRepository;
    @Autowired
    private  IMonitorNodeRepository monitorNodeRepository;
    @Autowired
    private  IMonitorType monitorTypeRepository;
    @Autowired
    private IMonitorAssignRepository monitorAssignRepository;

    @GetMapping(value = "/monitorCenter")
    public List<Map> getMonitorCenterList() {
        return monitorRepository.getCenterList();
    }
    @GetMapping(value = "/monitorNode")
    public Map getListNode() {
        long total =  monitorNodeRepository.count();
        List<Map> res = monitorNodeRepository.getNodeList();
        Map temp = new HashMap();
        temp.put("total", total);
        temp.put("data", res);
        return temp;
    }
    @PostMapping(value = "/monitorCenter/save")
    public boolean saveMonitorCenter(@RequestBody Map map) {
        try {
            MonitorCenter monitorCenter = new MonitorCenter();
            monitorCenter.setCenterName(map.get("centerName").toString());
            monitorCenter.setManager(map.get("manager").toString());
            monitorCenter.setRemark(map.get("remark").toString());
            MonitorCenter res = monitorRepository.save(monitorCenter);
            MonitorAssign temp = new MonitorAssign();
            temp.setSubCenterID(res.getCenterID());
            temp.setSupCenterID(new Integer(map.get("supCenterID").toString()));
            monitorAssignRepository.save(temp);
            return true;
        } catch (Exception e){
            System.out.print(e);
            return false;
        }
    }
    @GetMapping(value = "/monitorCenter/delete/{id}")
    public boolean  deleteMonitorCenter(@PathVariable("id") Integer id){
        try {
            monitorRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
    @PostMapping(value = "/monitorNode/save")
    public MonitorNode saveNode (@RequestBody MonitorNode monitorNode){
        return monitorNodeRepository.save(monitorNode);
    }
    @GetMapping(value = "/monitorNode/delete/{id}")
    public boolean  deleteMonitorNode(@PathVariable("id") Integer id){
        try {
            monitorNodeRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
