package com.sunny.entities;

import jakarta.persistence.*;

@Entity
@Table(name="user_table" , uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "email")
	private String userEmail;
	
	@Column(name = "first_name")
	private String userFirstName;
	
	@Column(name = "last_name")
	private String userLastName;
	
	@Column(name = "password")
	private String userPassword;
	
	public User() {
		
	}
	
	

	public User(String userEmail, String firstName, String lastName, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userFirstName = firstName;
		this.userLastName = lastName;
		this.userPassword = userPassword;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getFirstName() {
		return userFirstName;
	}

	public void setFirstName(String firstName) {
		this.userFirstName = firstName;
	}

	public String getLastName() {
		return userLastName;
	}

	public void setLastName(String lastName) {
		this.userLastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
