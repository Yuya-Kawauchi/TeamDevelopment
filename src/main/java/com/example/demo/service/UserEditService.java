package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserEditRepository;
import com.example.demo.entity.UserEditEntity;

public class UserEditService {
	@Service
	public class LeaningNewReportService{
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
	    /**
	     * ユーザー情報 主キー検索
	     * @return 検索結果
	     */
	    public UserEditEntity findById(Integer id) {
	      return userEditRepository.findById(id).get();
	    }
	}
	
	
}
