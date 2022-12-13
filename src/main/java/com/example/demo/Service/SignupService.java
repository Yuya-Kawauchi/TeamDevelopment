package com.example.demo.Service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import com.example.demo.dto.UserRequest;


/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SignupService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;
  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<UserEntity> searchAll() {
    return userRepository.findAll();
  }
  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(UserRequest userRequest) {
    Date now = new Date();
    UserEntity user = new UserEntity();
    user.setName(userRequest.getName());
    //user.setAddress(userRequest.getMail_address());
    //user.setpassword(userRequest.getPassword());
    //user.setCreateDate(now);
    //user.setUpdateDate(now);
    userRepository.save(user);
  }
}
