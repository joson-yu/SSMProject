package com.joson.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joson.domain.Account;
import com.joson.service.AccountService;

/*
 * 表现层
 * 账户web
 * 
 */

@Controller
@RequestMapping("account")
public class AccountController {
	//自动注入
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		System.out.println("数据已获得。。。。");
		//调用service方法,遍历
		List<Account> list = accountService.findAll();
		model.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping("/save")
	public void save(Account account,HttpServletRequest request,HttpServletResponse response) throws Exception {
		accountService.saveAccount(account);
		response.sendRedirect(request.getContextPath()+"/account/findAll");
		return;
	}
}
