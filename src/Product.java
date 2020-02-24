/**
 * Universidad Catolica Boliviana "San Pablo"
 * @author Diego
 * 
 * Product interface.
 */
public interface Product {
	/**
	 * Signature that checks if an amount of products are available
	 * @param amount of products to check
	 * @return true if the amount is available
	 */
	boolean isAvailable(int amount);
	
	/**
	 * Signature that makes an estimation
	 * @return the rate
	 */
	int estimateRate();
}
