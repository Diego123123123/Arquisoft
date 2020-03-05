package store.discount;

import store.OrderItem;

/**
 * Interface for discount order items depending on its category
 * Diego Orlando Mejia Salazar
 * 
 */
public interface IDiscountable {

	/**
	 * 
	 * @param orderItem to calculate discount for
	 * @return the total amount to pay appliying the discount
	 */
	float applyDiscount();
}
