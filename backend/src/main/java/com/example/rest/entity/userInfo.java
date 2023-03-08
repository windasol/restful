package com.example.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "test_entity")
public class userInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String user;
	private String pw;
	
	@Builder
	public userInfo(Long id, String name, String email, String user, String pw) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.user = user;
		this.pw = pw;	
	}

}
