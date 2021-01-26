package org.zeorck.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeorck.DTO.memberCriteriaDTO;
import org.zeorck.DTO.memberDTO;
import org.zeorck.mapper.MemberDAO;


@Service
public class Member2ServiceImpl implements Member2Service{
	@Autowired
	MemberDAO mdao;

	public void memberinsert(memberDTO mdto) {
		mdao.memberinsert(mdto);
	}

	public ArrayList<memberDTO> list(memberCriteriaDTO mcri) {
		return mdao.list(mcri);
	}


	public memberDTO memberdetail(memberDTO mdto) {
		
		return mdao.memberdetail(mdto);
	}


	public void memberupdate(memberDTO mdto) {
		
		mdao.memberupdate(mdto);
	}


	public void memberdelete(memberDTO mdto) {
		mdao.memberdelete(mdto);
		
	}


	public int getTotal() {
		return	mdao.getTotal();
	}


	public memberDTO login(memberDTO mdto) {
		System.out.println("service="+mdto);
		return mdao.login(mdto);
	}



}
