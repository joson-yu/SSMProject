package com.joson.test;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.joson.Dao.AccountDao;
import com.joson.domain.Account;


public class TestMyBatis {
	@Test
	public void run1() throws Exception {
		//加载配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建工厂
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
		//创建SQLSession对象
		SqlSession session = factory.openSession();
		//获取到代理对象
		AccountDao dao = session.getMapper(AccountDao.class);
		
		List<Account> list = dao.findAll();
		for(Account account:list) {
			System.out.println(account);
		}
		dao.findAll();
		//关闭资源
		session.close();
		in.close();
	}
	@Test
	public void run2() throws Exception {
		
		Account account = new Account();
		account.setName("chloe");
		account.setMoney(2000d);
		
		//加载配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建工厂
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
		//创建SQLSession对象
		SqlSession session = factory.openSession();
		//获取到代理对象
		AccountDao dao = session.getMapper(AccountDao.class);
		
		//保存到数据库
		dao.saveAccount(account);
		//提交事务
		
		session.commit();
		//关闭资源
		session.close();
		in.close();
	}
}
