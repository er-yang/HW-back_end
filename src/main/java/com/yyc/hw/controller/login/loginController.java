package com.yyc.hw.controller.login;

import com.yyc.hw.controller.account.IAccountRepository;
import com.yyc.hw.entity.Account;
import com.yyc.hw.util.JWTUtil;
import com.yyc.hw.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class loginController {
    @Autowired
    private IAccountRepository accountRepo;

    @PostMapping(value = "/login")
    public String login(@RequestBody Map map) {
        String accountCode = map.get("accountCode").toString();
        String passWord = map.get("passWord").toString();
        Account account = accountRepo.findAccountByAccountCodeEquals(accountCode);
        if (account.getPassWord().equals(MD5.MD5(passWord))) {
            String token = JWTUtil.sign(accountCode,passWord);
            return token;
        }
        else {
            return null;
        }
    }
}
