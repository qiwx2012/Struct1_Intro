package com.qiwx.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *@Author qiwx
 *@time  2017年7月4日 下午6:26:35
 *@Des
 **/
public class LoginForm extends ActionForm{
	String username;
	String password;
	
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		//先执行验证，此处可以验证表单参数
		return super.validate(mapping, request);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
