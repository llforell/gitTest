package org.zeorck.service;

import java.util.ArrayList;

import org.zeorck.DTO.ReplyDTO;

public interface ReplyService {

	//댓글쓰기
	public int replyInsert(ReplyDTO rdto);
	//댓글조회
	public ArrayList<ReplyDTO> getreplylist(int bno);
	//댓글수정
	public int replyUpdate(ReplyDTO rdto);
	//댓글 삭제
	public int replydDelete(ReplyDTO rdto);
	
	
	
}
