/**
 * 
 */
package com.demo.ngboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ngboot.model.User;

/**
 * @author Mehul
 *
  */
public interface UserDao extends JpaRepository< User, Integer> {

	/**
	 * @param userName
	 */
	User findByUsername(String userName);

}
