package org.zeorck.mapper;

import java.util.ArrayList;

import org.zeorck.DTO.Criteria;
import org.zeorck.DTO.boardDTO;

public interface BoardDAO {

	//글쓰기를 하기위한 DAO(insert)
	public void bbb(boardDTO bdto);
	//게시판 리스트
	public ArrayList<boardDTO> list(Criteria cri);
	//게시판 상세페이지
	public boardDTO detail(boardDTO bdto);
	//게시판 수정
	public void update(boardDTO bdto);
	//게시판 글삭제
	public void delete(boardDTO bdto);
	public int getTotal() ;
	
}
