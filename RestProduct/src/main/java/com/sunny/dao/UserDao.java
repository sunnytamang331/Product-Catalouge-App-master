package com.sunny.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunny.entities.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserDao.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	/**
	 * Find by user email and user password.
	 *
	 * @param email the email
	 * @param Password the password
	 * @return the user
	 */
	User findByUserEmailAndUserPassword(String email,String Password);	
	
	/**
	 * Exists by user email.
	 *
	 * @param email the email
	 * @return the boolean
	 */
	Boolean existsByUserEmail(String email);
}
