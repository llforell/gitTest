package org.zeorck.service;



import java.util.List;

import org.zeorck.DTO.boardDTO;

public interface BoardService {
	//sql문에서 #이 있으면 매개변수가 필요함
	//글쓰기(insert)
	public void boardInsert(boardDTO bdto);
	//제목을 클릭하면> 상세페이지(select) -1
	public boardDTO boardDetail(boardDTO bdto);
	//게시판 전체 리스트 페이지(select) -n
	public List<boardDTO> boardList();
	//수정(update)
	public void boardUpdate(boardDTO bdto);
	//삭제(delete)
	public void boardDelete(boardDTO bdto);
	
}
