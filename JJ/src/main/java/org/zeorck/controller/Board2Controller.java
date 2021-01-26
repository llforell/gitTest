package org.zeorck.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zeorck.DTO.Criteria;
import org.zeorck.DTO.PageDTO;
import org.zeorck.DTO.boardDTO;
import org.zeorck.service.Board2Service;

@Controller
@RequestMapping("/board")
public class Board2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Board2Controller.class);
	@Autowired
	Board2Service bservice;

	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void getWrite() {
		//jsp가는용
	}
	
	@RequestMapping(value="/writePost", method = RequestMethod.POST)
	public String postWrite(boardDTO bdto,Model model) {
		System.out.println("writePost");
		bservice.bbb(bdto);
		model.addAttribute("result","success");
		logger.info("--------------"+bdto);
	return "redirect:/board/list?id="+bdto.getWriter();
	
	}
	
//	@RequestMapping(value="/list", method = RequestMethod.GET)
//	@GetMapping("/list")
//	public void list(Model model) {
////		bservice.list().forEach(board->logger.info(""+board));;
//		model.addAttribute("list", bservice.list());
//	}
	
//	
	
	
	
	
	
	@GetMapping("/list")
	public void getListPaing(Criteria cri,Model model) {
	int total=bservice.getTotal();
	logger.info("cri="+cri);
	logger.info("전체건수:"+total);
	model.addAttribute("blist", bservice.list(cri));
	model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	
	
	
	
	
	
	
	@GetMapping("/detail")
	public void detail(Model model,boardDTO bdto) {
//		logger.info("contorller bdto"+bdto);
//		logger.info("controller detail="+bservice.detail(bdto));
		model.addAttribute("detail",bservice.detail(bdto));
		
	}
	
	@GetMapping("/update")
	public String update(boardDTO bdto) {
		logger.info("UPdate aaaaaaaaa");
		logger.info("bdto="+bdto);
		bservice.update(bdto);
		return "redirect:/board/detail?bno="+bdto.getBno();
		
	}
	
	@GetMapping("/delete")
	public String delete(boardDTO bdto) {
		logger.info("들어왔당");
		logger.info("bdto="+bdto);
		bservice.delete(bdto);
		return "redirect:/board/list";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
