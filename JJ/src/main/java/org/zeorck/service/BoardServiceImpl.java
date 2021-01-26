package org.zeorck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeorck.DTO.boardDTO;
import org.zeorck.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	//글쓰기(insert)
	public void boardInsert(boardDTO bdto) {
		
		boardMapper.BoardInsert(bdto);
	}

	//제목을 클릭하면> 상세페이지(select) -1
	public boardDTO boardDetail(boardDTO bdto) {
		return null;
	}

	//게시판 전체 리스트 페이지(select) -n
	public List<boardDTO> boardList() {
		
		return boardMapper.getList();
	}

	//수정(update)
	public void boardUpdate(boardDTO bdto) {
		boardMapper.BoardUpdate(bdto);
		
	}

	//삭제(delete)
	public void boardDelete(boardDTO bdto) {
		boardMapper.BoardDelete(bdto);
		
	}

}
