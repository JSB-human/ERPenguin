package com.erpenguin.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erpenguin.project.service.SampleService;
import com.erpenguin.project.service.SampleVo;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/main")
	public String Main(HttpServletRequest req) throws Exception {
		List<SampleVo> list = sampleService.selectSampleList();
		String str = "";
		// 테스트로 하나 들어가있음
		for(SampleVo vo : list) {
			System.out.println(vo.getSample_name());
			str = vo.getSample_name();
		}
		
		req.setAttribute("sample", str);
		
		return "main";
	}
	
	@RequestMapping("/")
	public String Home(Model model) throws Exception {
		List<SampleVo> list = sampleService.selectSampleList();
		String str = "";
		// 테스트로 하나 들어가있음
		for(SampleVo vo : list) {
			System.out.println(vo.getSample_name());
			str = vo.getSample_name();
		}
		model.addAttribute("sample", str);
		
		return "thymeleaf/home";
	}
	
}
