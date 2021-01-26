package org.zeorck.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.zeorck.DTO.BoardAttachDTO;
import org.zeorck.DTO.Criteria;
import org.zeorck.DTO.boardDTO;
import org.zeorck.mapper.BoardAttachDAO;
import org.zeorck.mapper.BoardDAO;

@Service
public class Board2ServiceImpl implements Board2Service{

	@Autowired
	BoardDAO bdao;
	@Autowired
	BoardAttachDAO battachdao;
	@Transactional
	public void bbb(boardDTO bdto) {
		bdao.bbb(bdto);
		bdto.getAttachList().forEach(attach->{
			attach.setBno(bdto.getBno());
			battachdao.insert(attach);
		});
		
	}
	
	public ArrayList<boardDTO> list(Criteria cri) {
		return bdao.list(cri);
		
	}


	public boardDTO detail(boardDTO bdto) {
		
		return bdao.detail(bdto);
	}


	public void update(boardDTO bdto) {
		bdao.update(bdto);
		
	}


	public void delete(boardDTO bdto) {
		bdao.delete(bdto);
	}

	public int getTotal() {
	return	bdao.getTotal();
	}

	


	
	
	
}
