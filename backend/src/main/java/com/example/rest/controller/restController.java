package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.userInfo;
import com.example.rest.repository.restRepository;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/rest")
@RequiredArgsConstructor
public class restController {
	
	private final restRepository restRepository;
	
	@GetMapping("/search")
	public List<userInfo> search() {				
		return restRepository.findAll();
				
	}

}
