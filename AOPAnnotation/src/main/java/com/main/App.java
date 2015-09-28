package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"app-context.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		 customer.addCustomer("1");

		// customer.addCustomerReturnValue();

		// customer.addCustomerThrowException();

		//customer.addCustomerAround("mkyong");

	}

}
