package store.discount;


public class AccessoriesDiscount extends Discount{

	@Override
	public float applyDiscount() {
		float totalAmountToPay = getOrderItem().getTotalAmountToPay();
		if (totalAmountToPay >= 100) {
			return totalAmountToPay * 9 / 10;
		}
		return totalAmountToPay;
	}

}
