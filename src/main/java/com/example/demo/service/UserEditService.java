package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserEditService {
	@Service
	public class LeaningNewReportService{
	    @Autowired
	    UserDao dao;
	     public boolean insert(UserEditService usereditservice) {
	        // insert実行
	        int rowNumber = dao.insertOne(usereditservice);
	        // 判定用変数
	        boolean result = false;

	        if (rowNumber > 0) {
	            // insert成功
	            result = true;
	        }
	        return result;
	    }

	    //カウント用メソッド.
	    public int count() {
	        return dao.count();
	    }

	    //全件取得用メソッド.
	    public List<usereditservice> selectMany() {
	        // 全件取得
	        return dao.selectMany();
	    }
	}
}

}
