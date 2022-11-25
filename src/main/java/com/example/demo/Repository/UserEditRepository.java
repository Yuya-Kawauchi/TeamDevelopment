package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEditEntity;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserEditRepository extends JpaRepository<UserEditEntity, Integer> {
}

//	    @Autowired
//	    JdbcTemplate jdbc;
//
//	    // Userテーブルの件数を取得.
//	    @Override
//	    public int count() throws DataAccessException {
//
//	        //全件取得してカウント
//	        int count = jdbc.queryForObject("SELECT COUNT(*) FROM m_user", Integer.class);
//	        return count;
//	    }
//
//	    // Userテーブルにデータを1件insert.
//	    @Override
//	    public int insertOne(User user) throws DataAccessException {
//
//	       //１件登録
//	        int rowNumber = Jdbc.update("INSERT INTO m_user(user_name,"
//	                + " password,"
//	                + " user_id,"
//	                + " emailadoress" 
//	                + " VALUES(?, ?, ?)",
//	                user.getUsername(),
//	                user.getserid(),
//	                user.getPassword(),
//	                user.getRole());
//
//	        return rowNumber;
//	    }
//
//	    // Userテーブルのデータを１件取得
//	    @Override
//	    public User selectOne(String userId) throws DataAccessException {
//	        return null;
//	    }
//
//	    // Userテーブルの全データを取得.
//	    @Override
//	    public List<User> selectMany() throws DataAccessException {
//
//	        // M_USERテーブルのデータを全件取得
//	        List<Map<String, Object>> getList = Jdbc.queryForList("SELECT * FROM m_user");
//	        // 結果返却用の変数
//	        List<User> userList = new ArrayList<>();
//	        // 取得したデータを結果返却用のListに格納していく
//	        for (Map<String, Object> map : getList) {
//
//	            //Userインスタンスの生成
//	            User user = new User();
//	            // Userインスタンスに取得したデータをセットする
//	            user.setUsername((String) map.get("user_name")); //ユーザー名
//	            user.setUserid((String) map.get("user_id")); //ユーザーID
//	            user.setPassword((String) map.get("password")); //パスワード
//	            user.setEmail((String) map.get("Emailadoress")); //パスワード
//	            //結果返却用のListに追加
//	            userList.add(user);
//	        }
//	        return userList;
//	    }
//
//	    // Userテーブルを１件更新.
//	    @Override
//	    public int updateOne(User user) throws DataAccessException {
//	        //１件登録
//	        int rowNumber = Jdbc.update("INSERT INTO m_user(user_name,"
//	                + " password,"
//	                + " user_id,"
//	                + " emailadoress" 
//	                + " VALUES(?, ?, ?)",
//	                user.getUsername(),
//	                user.getserid(),
//	                user.getPassword(),
//	                user.getemailadoress(),
//
//	        return rowNumber;
//	    }
//	    }
//
//	    // Userテーブルを１件削除.
//	    @Override
//	    public int deleteOne(String userId) throws DataAccessException {
//	        return 0;
//	    }
//
//	    //SQL取得結果をサーバーにCSVで保存する
//	    @Override
//	    public void userCsvOut() throws DataAccessException {
//	    }
//	}
//
//}
