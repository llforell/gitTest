package org.zeorck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class manController {

	@GetMapping("/")
	public String index() {
		return "/JPRO_1/index";
	}
}
