package store.discount;

import store.OrderItem;

public class BikeDiscount extends Discount {

	@Override
	public float applyDiscount() {
		float itemAmount = getOrderItem().getTotalAmountToPay();
		return itemAmount * 8 / 10;
	}

}
