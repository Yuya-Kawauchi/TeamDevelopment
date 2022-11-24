/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/userList")
    public String getUseEdit(@ModelAttribute UserEditForm form,@PathVariable Integer id
, Model model) {
        //ユーザー一覧の生成
    	UserEditEntity user = usereditservice.findById(id);
    	UserEditForm usereditform = new UserEditForm();
    	usereditform.setName(user.getName());
    	usereditform.setId(user.getId());
    	usereditform.setPassword(user.getPassword());
    	usereditform.setEmailaddress(user.getEmailaddress());
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