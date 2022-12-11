package com.example.demo.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<Employee , String> {  
}
