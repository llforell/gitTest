package org.zeorck.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeorck.DTO.ReplyDTO;
import org.zeorck.mapper.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyDAO rdao;
	//댓글쓰기
	public int replyInsert(ReplyDTO rdto) {
	return	rdao.replyInsert(rdto);
	}

	//댓글조회
	public ArrayList<ReplyDTO> getreplylist(int bno) {
		
		return rdao.getreplylist(bno);
	}

	//댓글수정
	public int replyUpdate(ReplyDTO rdto) {
	
	return	rdao.replyUpdate(rdto);
	}

	//댓글 삭제
	public int replydDelete(ReplyDTO rdto) {
		
		return rdao.replydDelete(rdto);
	}

}
