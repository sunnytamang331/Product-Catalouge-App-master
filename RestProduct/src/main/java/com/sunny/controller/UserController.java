package com.sunny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sunny.entities.Product;
import com.sunny.entities.User;
import com.sunny.payload.LoginDTO;
import com.sunny.payload.SignUpDTO;
import com.sunny.service.UserService;

/**
 * @author sunnytamang
 *
 */

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/signup")
	public User signUpUser(@RequestBody SignUpDTO signUpDTO) {
		User user = userService.addUserService(signUpDTO);
		if(user==null) {
			return null;
		}
		else {
			return user;
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login")
	public User loginUser(@RequestBody LoginDTO loginDTO) {
		return userService.authenticateUserService(loginDTO);
	}
}
