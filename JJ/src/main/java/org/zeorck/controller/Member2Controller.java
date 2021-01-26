package org.zeorck.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zeorck.DTO.PageDTO;
import org.zeorck.DTO.memberCriteriaDTO;
import org.zeorck.DTO.memberDTO;
import org.zeorck.DTO.memberPageDTO;
import org.zeorck.service.Member2Service;

@Controller
@RequestMapping(value = "/member",method = RequestMethod.GET)
public class Member2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Member2Controller.class);
	@Autowired
	Member2Service mservice;
	
	@GetMapping("login")
	public void getlogin() {
		logger.info("로그인 화면으로 이동");
	}

	@PostMapping("/login2")
	public String loginPost(memberDTO member,HttpSession session) {
		logger.info("controller="+member);
		memberDTO dto=mservice.login(member);
		session.setAttribute("aaaa", dto);
		logger.info("aaaa="+dto);
		if(session.getAttribute("aaaa")!=null) {
			return "redirect:/board/list";
		}else {
			return "redirect:/member/login";
		}
//	@PostMapping("/login2")
//	public String loginPost(memberDTO member,HttpSession session) {
//		logger.info("controller="+member);
//		memberDTO dto=mservice.login(member);
//		session.setAttribute("aaaa", dto);
//		logger.info("aaaa="+dto);
//		if(session.getAttribute("aaaa")!=null) {
//			return "redirect:/";
//		}else {
//			return "redirect:/board/list";
//		}
	}@PostMapping("/logout")
	public String logoutPost(HttpSession session) {
		session.removeAttribute("aaaa");
		logger.info("로그아웃됨");
		return "redirect:/JPRO_1/main";
	}
	
//	@PostMapping("/loginPost")
//	public String postLogin(memberDTO mdto,HttpSession session) {
//		boolean result=mservice.login(mdto,session);
//		if(result) {
//			return "redirect:/";
//			}else {
//				return "redirect:/member/login";
//			}
//	}@GetMapping("/logout")
//	public String getlogout(HttpSession session) {
//		session.invalidate();
//		return "redirect:/";
//	}
	
	
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void memberwrite1() {
	
	}
	
	
	@RequestMapping(value="/write2", method = RequestMethod.POST)
	public String memberwrite2(memberDTO mdto) {
		logger.info("mdto="+mdto);
		mservice.memberinsert(mdto);
		return "redirect:/JPRO_1/main";
	}
	
//	@GetMapping("/list")
//	public void list(Model model) {
//		model.addAttribute("list", mservice.list());
//		logger.info("model"+model);
//	}
	@GetMapping("/list")
	public void getlistPaing(Model model,memberCriteriaDTO mcri) {
		int total=mservice.getTotal();
		logger.info("cri="+mcri);
		logger.info("전체건수:"+total);
		model.addAttribute("blist", mservice.list(mcri));
		model.addAttribute("pageMaker", new memberPageDTO(mcri,60));
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("detail")
	public void detail(Model model,memberDTO mdto) {
		model.addAttribute("detail",mservice.memberdetail(mdto));
	}
	
	@PostMapping("/update")
	public String update(memberDTO mdto) {
		mservice.memberupdate(mdto);
		return "redirect:/member/detail?id="+mdto.getId();
	}
	
	@GetMapping("/delete")
	public String delete(memberDTO mdto) {
		mservice.memberdelete(mdto);
		return "redirect:/member/list";
	}
	
	@GetMapping("/aaa")
	public void aaa() {
		
	}
	
}
