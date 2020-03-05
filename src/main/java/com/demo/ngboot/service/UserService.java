package com.demo.ngboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ngboot.dao.UserDao;
import com.demo.ngboot.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	/**
	 * @param user
	 */
	public void saveUser(User user) {
		userDao.save(user);
	}

	/**
	 * @param userName
	 * @return
	 */
	public User checkUserName(String userName) {
		User user = userDao.findByUsername(userName); 
		if(user != null) {
			return user;
		}
		else {
			return null;
		}
		
	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean validateCredentials(String userName, String password) {
		
		return false;
	}

	/**
	 * @param user
	 * @return
	 */
	public boolean validateUser(User user) {
		User userDb = userDao.findByUsername(user.getUserName());
		//System.out.println("user by username from db ----->"+userDb.toString());
		if(userDb != null) {
			if(userDb.getUserName().equals(user.getUserName()) && userDb.getPassword().equals(user.getPassword())) {
				System.out.println("everything's perfect! :)");
				return true;
			}
			else {
				System.out.println("username and password not match!");
				return false;
			}
		}
		else {
			System.out.println("user does not exists with this username!");
			return false;
		}
		
	}
	
	
}
