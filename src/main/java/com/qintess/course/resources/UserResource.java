package com.qintess.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.course.entidades.User;

@RestController
@RequestMapping(value = "/users" )
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "João", "joaofonsorios@hotmail.com", "32255901", "senha");
		return ResponseEntity.ok().body(u);
	}
}
