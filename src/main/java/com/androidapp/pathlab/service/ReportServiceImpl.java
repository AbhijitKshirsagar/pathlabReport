package com.androidapp.pathlab.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.androidapp.pathlab.pojos.DetailedTestData;
import com.androidapp.pathlab.pojos.Tests;

public class ReportServiceImpl implements ReportService {

	@Autowired
	EntityManager entityManager; 
	
	@Override
	public List<Tests> getTestListForUser(String firstName, String moileNo) throws Exception {
	
		return null;
	}

	@Override
	public DetailedTestData getDetialsReportForTest(String firstName, String moileNo, String testName) throws Exception {
		return null;
	}

}
