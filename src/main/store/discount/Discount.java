package store.discount;

import store.OrderItem;

public abstract class Discount implements IDiscountable {

	private OrderItem orderItem;
	
	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
	
	public OrderItem getOrderItem() {
		return orderItem;
	}

}
