package com.androidapp.pathlab.pojos;

import java.util.List;

public class DetailedTestData {

	private List<TestParameters> testList;
	private int age;
	private String sex;
	private String userName;
	private String userId;

	/**
	 * @return the testList
	 */
	public List<TestParameters> getTestList() {
		return testList;
	}

	/**
	 * @param testList
	 *            the testList to set
	 */
	public void setTestList(List<TestParameters> testList) {
		this.testList = testList;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
