/**
 * 
 */
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
public class UserEditContoller {

    @GetMapping("/useredit")
    public String getUserEdit(Model model) {

        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
        model.addAttribute("contents", "login/home :: home_contents");
        return "login/homeLayout";
    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        model.addAttribute("name");
        model.addAttribute("id");
        model.addAttribute("password");
        return "/04";
    }

    @PostMapping("/04")
    public String postLogout() {
        return "redirect:/04";
    }

    @GetMapping("/04")
    public String getUserListCsv(Model model) {
        return getUserEdit(model);
    }
}