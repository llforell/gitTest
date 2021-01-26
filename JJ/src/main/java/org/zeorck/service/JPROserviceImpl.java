package org.zeorck.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeorck.DTO.JPROmemDTO;
import org.zeorck.mapper.JPROmemDAO;
@Service
public class JPROserviceImpl implements JPROservice{

	@Autowired
	JPROmemDAO mdao;
	
	public void memberinsert(JPROmemDTO mdto) {
	
		mdao.memberinsert(mdto);
	}

//	public boolean login(JPROmemDTO mdto,HttpSession session) {
//		JPROmemDTO login=mdao.login(mdto);
//		boolean result=false;
//		if(login!=null) {
//			session.setAttribute("login", login);
//			result=true;
//		}
//		return result;
//	}

}
