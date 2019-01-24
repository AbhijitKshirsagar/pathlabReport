package com.androidapp.pathlab.service;

import java.util.List;

import com.androidapp.pathlab.pojos.DetailedTestData;
import com.androidapp.pathlab.pojos.Tests;

public interface ReportService {
	
	public List<Tests> getTestListForUser (String firstName, String moileNo) throws Exception;
	public DetailedTestData getDetialsReportForTest (String firstName, String moileNo, String testName) throws Exception;

}
