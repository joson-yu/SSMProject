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
		//���������ļ�
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//��������
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
		//����SQLSession����
		SqlSession session = factory.openSession();
		//��ȡ���������
		AccountDao dao = session.getMapper(AccountDao.class);
		
		List<Account> list = dao.findAll();
		for(Account account:list) {
			System.out.println(account);
		}
		dao.findAll();
		//�ر���Դ
		session.close();
		in.close();
	}
	@Test
	public void run2() throws Exception {
		
		Account account = new Account();
		account.setName("chloe");
		account.setMoney(2000d);
		
		//���������ļ�
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//��������
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
		//����SQLSession����
		SqlSession session = factory.openSession();
		//��ȡ���������
		AccountDao dao = session.getMapper(AccountDao.class);
		
		//���浽���ݿ�
		dao.saveAccount(account);
		//�ύ����
		
		session.commit();
		//�ر���Դ
		session.close();
		in.close();
	}
}
