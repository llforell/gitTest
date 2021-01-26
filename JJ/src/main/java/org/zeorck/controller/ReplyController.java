package org.zeorck.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zeorck.DTO.ReplyDTO;
import org.zeorck.service.ReplyService;

@RestController
@RequestMapping(value="/replies",method=RequestMethod.GET)
public class ReplyController {

	@Autowired
	ReplyService rservice;
	
	
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseEntity<String> rpwrite(@RequestBody ReplyDTO rdto) {
		int result=rservice.replyInsert(rdto);
		
	return	result == 1 ? new ResponseEntity<>("success",HttpStatus.OK)
				:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}//-----댓글작성
	
	
	
	
	
	
	
	@RequestMapping(value = "/{bno}",method = RequestMethod.GET)
	private ResponseEntity<ArrayList<ReplyDTO>> getList(@PathVariable("bno")int bno) {
			return new ResponseEntity<>(rservice.getreplylist(bno),HttpStatus.OK);
	}//리스트 옮기기
// @PathVariable= ajax에서 아이디나 패스워드 받을때 쓰는것
	
	
	
	
	
	
	
	
	@RequestMapping(value="/modify",method=RequestMethod.PUT)
	public ResponseEntity<String> Update(@RequestBody ReplyDTO rdto) {
		int result=rservice.replyUpdate(rdto);
		
	return	result == 1 ? new ResponseEntity<>("success",HttpStatus.OK)
				:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}//--------댓글 수정
	
	
	
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public ResponseEntity<String> Delete(@RequestBody ReplyDTO rdto) {
		int result=rservice.replydDelete(rdto);
		
	return	result == 1 ? new ResponseEntity<>("success",HttpStatus.OK)
				:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}//--------댓글 수정
	
	
	
	
}
