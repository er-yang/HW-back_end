package com.yyc.hw.controller.account;

import com.yyc.hw.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Integer>{

}
