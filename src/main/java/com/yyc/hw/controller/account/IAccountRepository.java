package com.yyc.hw.controller.account;

import com.yyc.hw.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IAccountRepository extends JpaRepository<Account, Integer>{
    @Query(value = "SELECT a.* , d.departmentName from account a LEFT JOIN department d on a.departmentID = d.departmentID",nativeQuery = true)
    public List<Map> getAccountList();
}
