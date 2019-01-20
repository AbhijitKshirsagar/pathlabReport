package com.androidapp.pathlab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidapp.pathlab.service.LoginService;
import com.androisapp.pathlab.pojos.Customer;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/validateUser")
	public ResponseEntity validateUser( String mobileNumber,  String firstName) {

		if ((null != firstName) && (null != mobileNumber)) {
			Customer customer = loginService.validateUser(firstName, mobileNumber);
			return ResponseEntity.status(HttpStatus.OK).body(customer);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Data");
		}

	}

}
