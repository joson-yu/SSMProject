package com.joson.Dao;
import com.joson.domain.Account;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/*
 * Dao��
 * �˻�dao�ӿ�
 */
//��Dao��Ҳ����Spring��������
@Repository
public interface AccountDao {
	/*
	 * findAll:��ѯ��Ϣ
	 * saveAccount:������Ϣ
	 */
	@Select("select * from account")
	public List<Account> findAll();
	@Insert("insert into account (name,money) values(#{name},#{money})")
	public void saveAccount(Account account);
}
