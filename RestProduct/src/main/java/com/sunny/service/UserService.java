package com.sunny.service;

import com.sunny.entities.User;
import com.sunny.payload.LoginDTO;
import com.sunny.payload.SignUpDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Adds the user service.
	 *
	 * @param signUpDTO the sign up DTO
	 * @return the user
	 */
	User addUserService(SignUpDTO signUpDTO);
	
	/**
	 * Authenticate user service.
	 *
	 * @param loginDTO the login DTO
	 * @return the user
	 */
	User authenticateUserService(LoginDTO loginDTO);
}
