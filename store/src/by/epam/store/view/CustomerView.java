package by.epam.store.view;

import java.util.ArrayList;

import by.epam.store.entity.Customer;

public class CustomerView {
	
	public void print(String message, ArrayList<Customer> customers) {
		
		System.out.println(message);
		for (int i = 0; i < customers.size(); i++) {

			System.out.println(customers.get(i));
		}
	}
}