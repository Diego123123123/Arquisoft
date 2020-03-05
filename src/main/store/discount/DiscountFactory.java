package store.discount;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import store.OrderItem;
import store.ProductCategory;

public class DiscountFactory {

	public IDiscountable getDiscountStrategy(OrderItem orderItem) {
		Discount discount;
		if (orderItem.getProduct().getCategory() == ProductCategory.Accessories) {
			discount = new AccessoriesDiscount();
			discount.setOrderItem(orderItem);
			return discount;
		}
		if (orderItem.getProduct().getCategory() == ProductCategory.Bikes) {
			discount = new BikeDiscount();
			discount.setOrderItem(orderItem);
			return discount;
		}
		discount = new CloathingDiscount();
		discount.setOrderItem(orderItem);
		return discount;
	}
}
