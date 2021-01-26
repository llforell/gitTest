package org.zeorck.service;

import java.util.ArrayList;

import org.zeorck.DTO.Criteria;
import org.zeorck.DTO.boardDTO;
import org.zeorck.DTO.memberDTO;

public interface Board2Service {

	
//	게시판 글쓰기
	public void bbb(boardDTO bdto);
//	게시판 리스트
	public ArrayList<boardDTO> list(Criteria cri);
//	게시판 상세페이지
	public boardDTO detail(boardDTO bdto);
//	게시판 글수정
	public void update(boardDTO bdto);
//	게시판 글 삭제
	public void delete(boardDTO bdto);
//페이징 처리
	public int getTotal() ;
	
	
}
