package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.UserEntity;




/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {}

//画面
//コントロール
//サービス
//リポジトリ
//エンティティ
