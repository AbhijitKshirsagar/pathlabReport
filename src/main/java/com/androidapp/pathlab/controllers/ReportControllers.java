package com.androidapp.pathlab.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportControllers {
	
	@RequestMapping("testList")
	  public ResponseEntity getTestListForUser( String firstName ,String mobileNo) {
		  return null;
		  
	  }
	
	
	
	

}
