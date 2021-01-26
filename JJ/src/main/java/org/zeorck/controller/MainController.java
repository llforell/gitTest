package org.zeorck.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/JPRO_1")
public class MainController {

	@GetMapping("/")
	public  String index() {
		return "index";
	}

	@GetMapping("/main")
	public void grid() {
		
	}
	
	@GetMapping("/member")
	public String member() {
		return "redirect:/member/write";
	}
	
	


	
	@GetMapping("/Introduction")
	public void intro() {
		
	}
	@GetMapping("/aaa")
	public void aaa() {
		
	}
	
@GetMapping("/loginlogin")
public String log() {
	return "redirect:/member/login";
}
	

	
	
//	@PostMapping("/loginPost")
//	public String postlogin(JPROmemDTO mdto,HttpSession session,RedirectAttributes rttr) {
//		boolean result=service.login(mdto,session);
//		if(result) {
//			rttr.addFlashAttribute("msg","success");
//			return "redirect:/JPRO_1/main";
//		}else {
//			rttr.addFlashAttribute("msg","fail");
//			return "redirect:/JPRO_1/login";
//		}
		
//	}
	
	
}
