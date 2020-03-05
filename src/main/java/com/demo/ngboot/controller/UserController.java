/**
 * 
 */
package com.demo.ngboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ngboot.model.User;
import com.demo.ngboot.service.UserService;

/**
 * @author Mehul
 *
 */

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.saveUser(user);
		return "";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		if(userService.validateUser(user) == false) {
			return "kuch to locha hai..";
		}
		else {
			return "chal gaya!!";
		}
			
	}
}
