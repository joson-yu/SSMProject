package com.joson.service;
import com.joson.domain.Account;

import java.util.List;
/*
 * service层
 * service接口
 */

public interface AccountService {
	/*
	 * findAll:查询信息
	 * saveAccount:保存信息
	 */
	public List<Account> findAll();
	
	public void saveAccount(Account account);
}
