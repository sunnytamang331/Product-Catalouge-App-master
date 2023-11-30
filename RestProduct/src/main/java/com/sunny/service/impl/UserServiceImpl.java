package com.sunny.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunny.dao.UserDao;
import com.sunny.entities.User;
import com.sunny.payload.LoginDTO;
import com.sunny.payload.SignUpDTO;
import com.sunny.service.UserService;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
@Service
public class UserServiceImpl implements UserService {

	/** The user dao. */
	@Autowired
	private UserDao userDao;
	
	/**
	 * Adds the user service.
	 *
	 * @param signUpDTO the sign up DTO
	 * @return the user
	 */
	@Override
	public User addUserService(SignUpDTO signUpDTO) {
		
		// TODO Auto-generated method stub
//		User user = new User(signUpDTO.getEmail(),signUpDTO.getFirstName(),
//				signUpDTO.getLastName, signUpDTO.getPassword());
		
		if(userDao.existsByUserEmail(signUpDTO.getEmail())) {
			return null;
		}
		
		User user = new User();
		user.setFirstName(signUpDTO.getFirstName());
		user.setLastName(signUpDTO.getLastName());
		user.setUserEmail(signUpDTO.getEmail());
		user.setUserPassword(signUpDTO.getPassword());
		userDao.save(user);
		return user;
	}

	/**
	 * Authenticate user service.
	 *
	 * @param loginDTO the login DTO
	 * @return the user
	 */
	@Override
	public User authenticateUserService(LoginDTO loginDTO) {
		User user = userDao.findByUserEmailAndUserPassword(
				loginDTO.getEmail(), loginDTO.getPassword());
		return user;
	};
}
