package it.xpug.ocp.customerbase;

import java.util.*;
import java.util.function.Predicate;


public class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> findByLastName(String lastName) {
		return findBy((c) -> c.lastName().equals(lastName));
	}

	public List<Customer> findByFirstAndLastName(String firstName, String lastName) {
		return findBy((c) -> c.lastName().equals(lastName) && c.firstName().equals(firstName));
	}

	public List<Customer> findByCreditGreaterThan(int credit) {
		return findBy((c) -> c.credit() > credit);
	}

	public List<Customer> findBy(Predicate<Customer> predicate) {
		List<Customer> result = new ArrayList<>();
		for (Customer customer : customers) {
			if (predicate.test(customer)) {
				result.add(customer);
			}
		}
		return result;
	}

}
