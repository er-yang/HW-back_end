package com.yyc.hw.controller.account;


import com.yyc.hw.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.reflect.annotation.ExceptionProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class accountController {
    @Autowired
    private IAccountRepository accountRepo;

    @GetMapping(value = "/user")
    public List<Account> accountList() {
        return accountRepo.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public Account getAcountById(@PathVariable("id") Integer id) {
        return accountRepo.getOne(id);
    }
    @PostMapping(value = "/user/save")
    public Account saveAccount(@RequestBody Account new_acc) {
        Account user = new Account();
        user.setAccountcode(new_acc.getAccountcode());
        user.setAccountName(new_acc.getAccountName());
        user.setPassWord(new_acc.getPassWord());
        user.setState(new_acc.getState());
        user.setPhone(new_acc.getPhone());
        user.setRemark(new_acc.getRemark());
        return accountRepo.save(user);
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
