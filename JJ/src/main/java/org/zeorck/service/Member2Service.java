package org.zeorck.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.zeorck.DTO.memberCriteriaDTO;
import org.zeorck.DTO.memberDTO;

public interface Member2Service {
//	회원가입
	public void memberinsert(memberDTO mdto);
//	게시판 리스트
	public ArrayList<memberDTO> list(memberCriteriaDTO mcri);
//	게시판 상세페이지
	public memberDTO memberdetail(memberDTO mdto);
//	게시판 글수정
	public void memberupdate(memberDTO mdto);
//	게시판 글 삭제
	public void memberdelete(memberDTO mdto);
	public int getTotal();
	public memberDTO login(memberDTO mdto);
}
