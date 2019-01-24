package com.androidapp.pathlab.service;

import com.androidapp.pathlab.pojos.Customer;
import com.androidapps.exceptions.ServiceException;

public interface LoginService {

	public Customer validateUser(String firstName, String mobileNumber) throws ServiceException;

}
