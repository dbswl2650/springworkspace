package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomController {
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Hello, Boot!";
	}
}
