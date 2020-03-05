package store;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import store.discount.DiscountFactory;
import store.discount.IDiscountable;

public class Order {

	private Customer customer;
	private Salesman salesman;
	private Date orderedOn;
	private String deliveryStreet;
	private String deliveryCity;
	private String deliveryCountry;
	private Set<OrderItem> items;

	public Order(Customer customer, Salesman salesman, String deliveryStreet, String deliveryCity, String deliveryCountry, Date orderedOn) {
		this.customer = customer;
		this.salesman = salesman;
		this.deliveryStreet = deliveryStreet;
		this.deliveryCity = deliveryCity;
		this.deliveryCountry = deliveryCountry;
		this.orderedOn = orderedOn;
		this.items = new HashSet<OrderItem>();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public Date getOrderedOn() {
		return orderedOn;
	}

	public String getDeliveryStreet() {
		return deliveryStreet;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public String getDeliveryCountry() {
		return deliveryCountry;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	public float total() {
		float totalItems = 0;
		DiscountFactory discountFactory = new DiscountFactory();
		for (OrderItem item : items) {
			IDiscountable discount = discountFactory.getDiscountStrategy(item);
			totalItems += discount.applyDiscount();
		}

		if (this.deliveryCountry == "USA"){
			return totalItems + totalItems * 5 / 100;
		}
		return totalItems + totalItems * 5 / 100 + 15;
	}
}
