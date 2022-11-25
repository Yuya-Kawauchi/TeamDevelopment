/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.entity.UserEditForm;
import com.example.demo.service.UserEditService;

@Controller
public class UserEditContoller {

    @Autowired
    UserEditService usereditservice;

    @GetMapping("/useredit")
    public String getHome() {
    //トップページにいくよ
        return "/topPage";
    }

    @GetMapping("/userlist")
    public String getUseEdit(UserEditForm form, Model model) {
        //ユーザー一覧の生成
    	UserEditEntity user = usereditservice.findById(form.getUser_id());
    	UserEditForm usereditform = new UserEditForm();
    	usereditform.setUser_id(user.getUser_id());
    	usereditform.setName(user.getName());
    	usereditform.setPassword(user.getPassword());
    	usereditform.setMail_address(user.getMail_address());
        model.addAttribute("userUpdateRequest", usereditform);
        return "user/edit";
      }
}
//        model.addAttribute("usereditForm",form);
//    	  //ユーザー一覧画面にリダイレクト
//        List<User> userList = usereditservice.selectMany();
//        //Modelにユーザーリストを登録
//        model.addAttribute("userList", userList);
//        //データ件数を取得
//        int count = usereditservice.count();
//        model.addAttribute("userListCount", count);
//        return "/UserEdit";
//    }
//}