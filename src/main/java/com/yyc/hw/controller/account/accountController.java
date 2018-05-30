package com.yyc.hw.controller.account;


import com.yyc.hw.entity.Account;
import com.yyc.hw.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.reflect.annotation.ExceptionProxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class accountController {
    @Autowired
    private IAccountRepository accountRepo;

    @GetMapping(value = "/user")
    public Map accountList() {
        long total = accountRepo.count();
        List res = accountRepo.getAccountList();
        Map map = new HashMap();
        map.put("total", total);
        map.put("data",res);
        return map;
    }

    @GetMapping(value = "/user/{id}")
    public Account getAcountById(@PathVariable("id") Integer id) {
        return accountRepo.getOne(id);
    }
    @PostMapping(value = "/user/save")
    public Account saveAccount(@RequestBody Account new_acc) {
        String passWord = new_acc.getPassWord();
        new_acc.setPassWord(MD5.MD5(passWord));
        return accountRepo.save(new_acc);
    }
    @GetMapping(value = "user/delete/{id}")
    public boolean deleteAccount (@PathVariable("id") Integer id) {
       try {
           accountRepo.deleteById(id);
           return true;
       }
        catch (Exception e){
                return false;
        }
    }
    @PostMapping(value = "user/delete")
    public  boolean deleteAccounts (@RequestBody ArrayList<String> list) {
        try {
            accountRepo.deleteAll();
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
