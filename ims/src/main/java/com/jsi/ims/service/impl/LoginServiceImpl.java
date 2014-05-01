package com.jsi.ims.service.impl;

import com.jsi.ims.dto.LoginDTO;
import com.jsi.ims.dao.LoginDAO;
import com.jsi.ims.service.LoginService;

public class LoginServiceImpl implements LoginService{

	private LoginDAO loginDAO;
	
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public String loginVarify(LoginDTO loginDTO){
		
		return loginDAO.loginVarify(loginDTO);
		
	}
	
}
