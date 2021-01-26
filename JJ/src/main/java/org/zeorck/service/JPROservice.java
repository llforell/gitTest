package org.zeorck.service;

import javax.servlet.http.HttpSession;

import org.zeorck.DTO.JPROmemDTO;

public interface JPROservice {

	public void memberinsert(JPROmemDTO mdto);
//	public JPROmemDTO login(JPROmemDTO mdto, HttpSession session);
}
