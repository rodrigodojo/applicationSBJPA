package com.rodrigodojo.applicationsbjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodojo.applicationsbjpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User( 1L,"maria","maria@gmail.com","99999999","12345");
		return ResponseEntity.ok().body(u);
	}

}
