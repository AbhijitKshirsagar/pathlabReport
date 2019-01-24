package com.androidapp.pathlab.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidapp.pathlab.pojos.Customer;

@Service
public class LoginServiceImpl  implements LoginService{

	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public Customer validateUser(String firstName, String mobileNumber) {
		firstName = "%" + firstName + "%";
		
		String mobileNo= mobileNumber.toString();
		String mobileNum = "%" + mobileNo + "%";
		List<Object[]> usersData = entityManager.createNativeQuery(
				"select RegNo ,FirstName,PatientPhoneNo from patmst where PatientPhoneNo like :phoneNumber and FirstName like :firstName")
				.setParameter("firstName", firstName).setParameter("phoneNumber", mobileNum).getResultList();
		if (null != usersData) {
			for (Object[] data : usersData) {
				Customer customer = new Customer();
				customer.setRegNo((String) data[0]);
				customer.setFirstName((String) data[1]);
				customer.setMobileNumber((String) data[2]);
				return customer;
			}
		}
		return null;
	}

	
}
