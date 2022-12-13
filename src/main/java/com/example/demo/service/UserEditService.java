//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Repository.UserEditRepository;
//import com.example.demo.entity.UserEditEntity;
//import com.example.demo.entity.UserEditForm;
//
//@Service
//public class UserEditService {
//	
//	
//
//		@Autowired
//		UserEditRepository userEditRepository;
//		
//		public List<UserEditEntity> serchAll() {
//			return userEditRepository.findAll();
//		}
//		public UserEditEntity findById(Integer user_id) {
//			return userEditRepository.findById(user_id).get();
//		}	
//		//ユーザー更新
//		public void update(UserEditForm editForm) {
//			UserEditEntity user = findById(editForm.getUser_id());
//			user.setUser_id(editForm.getUser_id());
//			user.setName(editForm.getName());
////			user.setName_kana(editForm.getName_kana());
//			user.setPassword(editForm.getPassword());
//			user.setMail_address(editForm.getMail_address());	
//			userEditRepository.save(user);
//		}
//
//}
