package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserEditRepository;
import com.example.demo.entity.UserEditEntity;
import com.example.demo.entity.UserEditForm;

@Service
public class UserEditService {
	
	

		@Autowired
		UserEditRepository userEditRepository;
		//	    
		//	     public boolean updateOne(UserEditService usereditservice) {
		//	        // insert実行
		//	        int rowNumber = repository.insertOne(usereditservice);
		//	        // 判定用変数
		//	        boolean result = false;
		//
		//	        if (rowNumber > 0) {
		//	            // insert成功
		//	            result = true;
		//	        }
		//	        return result;
		//	    }
		//
		//	    //カウント用メソッド.
		//	    public int count() {
		//	        return repository.count();
		//	    }
		//
		//	    //全件取得用メソッド.
		//	    public List<repository> selectMany() {
		//	        // 全件取得
		//	        return dao.selectMany();
		//	        
		//	    }

		public List<UserEditEntity> serchAll() {
			return userEditRepository.findAll();
		}

		

		public UserEditEntity findById(Integer user_id) {
			return userEditRepository.findById(user_id).get();
		}

		/**
		 * ユーザー情報 主キー検索
		 * @return 検索結果
		 */
		//		public UserEditEntity findById(Integer user_id) {
		//			return userEditRepository.findById(user_id).get();
		//		}
		//	    public User findById(Long id) {
		//	        return userRepository.findById(id).get();
		//	}
		
		
		//ユーザー更新

		public void update(UserEditForm editForm) {
			UserEditEntity user = findById(editForm.getUser_id());
			user.setUser_id(editForm.getUser_id());
			user.setPassword(editForm.getPassword());
			user.setMail_address(editForm.getMail_address());
			user.setName(editForm.getName());

			userEditRepository.save(user);
		}

	

}
