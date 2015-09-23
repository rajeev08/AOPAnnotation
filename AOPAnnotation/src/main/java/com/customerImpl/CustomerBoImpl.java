package com.customerImpl;

import com.customer.CustomerBo;

public class CustomerBoImpl implements CustomerBo {

	
	public void addCustomer(String name) {
		System.out.println("addCustomer() is running "+name);
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
	}

}
