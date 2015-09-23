package com.customer;

public interface CustomerBo {

	void addCustomer(String name);

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name);

}
