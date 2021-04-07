package by.epam.store.entity;

import java.util.ArrayList;

public class BuyerList {
	
	private ArrayList<Customer> customers;

	{
		customers = new ArrayList<Customer>();
	}
	public BuyerList() {
		
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuyerList other = (BuyerList) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BuyerList [customers=" + customers + "]";
	}
	
}