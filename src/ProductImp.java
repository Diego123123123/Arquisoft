/**
 * Abstract class for products.
 * @author Diego Orlando Mejia Salazar
 *
 */
public abstract class ProductImp implements Product {

	/**
	 * Estimation behaviour.
	 */
	private Estimation estimation;

	/**
	 * Product name.
	 */
	private String name;

	/**
	 * Product price.
	 */
	private int price;

	/**
	 * Signature that tells is a product is available.
	 */
	@Override
	public abstract boolean isAvailable(int amount);

	/**
	 * Method that returns the estimation the product price.
	 */
	@Override
	public int estimateRate () {
		return estimation.estimate(price);
	}

	/**
	 * Method that sets up the estimation behaviour.
	 * @param newEstimation is the new estimation
	 */
	public void setEstimation(Estimation newEstimation) {
		estimation = newEstimation;
	}

	/**
	 * Method that sets up a product name
	 * @param newName is the new product name
	 */
	public void setName(final String newName) {
		name = newName;
	}

	/**
	 * Method that returns the name of the product
	 * @return the product name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that gets the price
	 * @return the product price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Method that sets up the price of a product
	 * @param newPrice is the new price
	 * @throws Exception if the new price is negative
	 */
	public void setPrice(int newPrice) throws Exception{
		if (newPrice < 0) {
			throw new Exception("cannot be negative");
		}
		price = newPrice;
	}
}
