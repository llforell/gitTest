package org.zeorck.mapper;



import java.util.List;

import org.zeorck.DTO.boardDTO;

public interface BoardMapper {
	//게시판 전체 목록 리스트select
		public List<boardDTO> getList();
	//insert
	public void BoardInsert(boardDTO bdto);
	//update
	public void BoardUpdate(boardDTO bdto);
	//delete
	public void BoardDelete(boardDTO bdto);
		


}
