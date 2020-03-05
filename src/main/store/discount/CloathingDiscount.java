package store.discount;


public class CloathingDiscount extends Discount {

	@Override
	public float applyDiscount() {
		float itemAmount = getOrderItem().getTotalAmountToPay();
		if (getOrderItem().getQuantity() > 2) {
			float discount = getOrderItem().getProduct().getUnitPrice();
			return itemAmount - discount;
		}
		return itemAmount;
	}

}
