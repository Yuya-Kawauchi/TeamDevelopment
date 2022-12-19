package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.entity.UserEditForm;
import com.example.demo.repository.UserEditRepository;

@Service
public class UserEditService {
	
		@Autowired
		UserEditRepository userEditRepository;
		
		public List<UserEditEntity> serchAll() {
			return userEditRepository.findAll();
		}
		public UserEditEntity findById(Integer user_id) {
			return userEditRepository.findById(user_id).get();
		}	
		//ユーザー更新
		public void update(UserEditForm usereditform) {
			UserEditEntity user = findById(usereditform.getUser_id());
			user.setUser_id(usereditform.getUser_id());
			user.setName(usereditform.getName());
			user.setPassword(usereditform.getPassword());
			user.setMail_address(usereditform.getMail_address());	
			userEditRepository.save(user);
		}
}
