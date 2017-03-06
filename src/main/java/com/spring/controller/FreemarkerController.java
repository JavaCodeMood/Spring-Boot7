package com.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {
	
	@RequestMapping("/hello/{name}") 
	public String hello(@PathVariable("name") String name, Model model) { 
		model.addAttribute("name",name);
		model.addAttribute("age",25);
		model.addAttribute("sex","女");
		model.addAttribute("address","北京市");
		model.addAttribute("createTime", new Date()); 
		//返回的内容要与你的视图相同
		return "free"; 
	}
	
	//http://localhost:8080/hello/美女

}
