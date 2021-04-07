package by.epam.store.logic;

import java.util.ArrayList;

import by.epam.store.entity.*;

public class CustomerLogic {

	public ArrayList<Customer> sortByAlphabet(ArrayList<Customer> customers) {

		ArrayList<Customer> sortCustomer = new ArrayList<Customer>();
		sortCustomer.addAll(customers);

		for (int i = 0; i < sortCustomer.size() - 1; i++) {
			for (int j = i + 1; j < sortCustomer.size(); j++) {
				if (sortCustomer.get(i).getSurname().compareTo(sortCustomer.get(j).getSurname()) > 0) {
					Customer temp = sortCustomer.get(i);
					sortCustomer.set(i, sortCustomer.get(j));
					sortCustomer.set(j, temp);
				}
			}
		}
		return sortCustomer;
	}

	public ArrayList<Customer> sortByNumber(ArrayList<Customer> customers) {

		ArrayList<Customer> sortCustomer = new ArrayList<Customer>();
		sortCustomer.addAll(customers);

		ArrayList<Customer> sortCustomers = new ArrayList<Customer>();

		for (int i = 0; i < sortCustomer.size() - 1; i++) {
			if ((sortCustomer.get(i).getNumberOfCreditcart() > 4800256425640001L)
					& (sortCustomer.get(i).getNumberOfCreditcart() < 4800256425640006L)) {
				sortCustomers.add(customers.get(i));
			}
		}
		return sortCustomers;
	}
}
