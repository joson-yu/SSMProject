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
	//���ϵ����һ����service��Dao
	@Autowired
	private AccountDao accountdao;
	
	
	@Override
	public List<Account> findAll() {
		System.out.println("ҵ��㣺��ѯ���е��˻���Ϣ������");
		return accountdao.findAll();
	}
	
	
	@Override
	public void saveAccount(Account account) {
		System.out.println("ҵ��㣺�����˻���Ϣ������");
		accountdao.saveAccount(account);
	}
	
}
