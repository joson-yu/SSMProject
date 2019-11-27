package com.joson.service.impl;

import java.util.List;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joson.Dao.AccountDao;
import com.joson.domain.Account;
import com.joson.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
	//整合的最后一步，service调Dao
	@Autowired
	private AccountDao accountdao;
	
	
	@Override
	public List<Account> findAll() {
		System.out.println("业务层：查询所有的账户信息。。。");
		return accountdao.findAll();
	}
	
	
	@Override
	public void saveAccount(Account account) {
		System.out.println("业务层：保存账户信息。。。");
		accountdao.saveAccount(account);
	}
	
}
