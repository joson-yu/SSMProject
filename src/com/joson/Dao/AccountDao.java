package com.joson.Dao;
import com.joson.domain.Account;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/*
 * Dao层
 * 账户dao接口
 */
//将Dao层也交给Spring容器管理
@Repository
public interface AccountDao {
	/*
	 * findAll:查询信息
	 * saveAccount:保存信息
	 */
	@Select("select * from account")
	public List<Account> findAll();
	@Insert("insert into account (name,money) values(#{name},#{money})")
	public void saveAccount(Account account);
}
