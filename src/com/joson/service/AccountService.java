package com.joson.service;
import com.joson.domain.Account;

import java.util.List;
/*
 * service��
 * service�ӿ�
 */

public interface AccountService {
	/*
	 * findAll:��ѯ��Ϣ
	 * saveAccount:������Ϣ
	 */
	public List<Account> findAll();
	
	public void saveAccount(Account account);
}
