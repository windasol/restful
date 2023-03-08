package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.userInfo;

public interface restRepository extends JpaRepository<userInfo, Long>{

}
