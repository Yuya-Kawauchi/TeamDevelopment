package com.example.demo.controller;

	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

	/**
	 * @author haruc
	 *
	 */

	@Controller
	public class LeaningNewPort {

	    @GetMapping("/leaningnewport")
	    public String getleaningnewport(Model model) {

	        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
	        model.addAttribute("contents", "login/home :: home_contents");
	        return "login/homeLayout";
	    }

	    @GetMapping("/leaningnewport")
	    public String getleaningmewport(Model model) {
	        model.addAttribute("date");
	        model.addAttribute("startTime");
	        model.addAttribute("endTime");
	        return "/05";
	    }

	    @PostMapping("/05")
	    public String postLogout() {
	        return "redirect:/05";
	    }

	    @GetMapping("/05")
	    public String getUserListCsv(Model model) {
	        return getleaningnewport(model);
	    }
	}

