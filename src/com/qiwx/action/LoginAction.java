package com.qiwx.action;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;
import com.qiwx.ResponseJson;
import com.qiwx.UserInfo;
import com.qiwx.form.LoginForm;

/**
 * @Author qiwx
 * @time 2017年7月4日 下午6:03:12
 * @Des
 **/
public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("execute======");
		LoginForm lfForm = (LoginForm) form;
		String userNameString = lfForm.getUsername();
		String pwdString = lfForm.getPassword();
		if (userNameString != null && userNameString.equals("qiwx")) {
			// request.getRequestDispatcher("/Success.jsp").forward(request,
			// response);
			// return mapping.findForward("success");
			response.setContentType("application/json; charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName("小明");
			userInfo.setPassWord("123456");
			ResponseJson rjJson = new ResponseJson<UserInfo>();
			rjJson.setData(userInfo);
			rjJson.setStatus(200);
			rjJson.setMessage("请求成功");
			String userJson = new Gson().toJson(rjJson);
			OutputStream out = response.getOutputStream();
			out.write(userJson.getBytes("UTF-8"));
			out.flush();
		} else {
			// return mapping.findForward("fail");
		}

		return null;
	}

}
