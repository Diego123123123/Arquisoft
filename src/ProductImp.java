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
	 * Signature that tells is a product is available
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

	public void setEstimation(Estimation newEstimation) {
		estimation = newEstimation;
	}

	public void setName(final String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int newPrice) throws Exception{
		if (newPrice < 0) {
			throw new Exception("cannot be negative");
		}
		price = newPrice;
	}
}
