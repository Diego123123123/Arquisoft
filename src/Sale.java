import java.util.ArrayList;

public class Sale {
	/**
	 * Products list.
	 */
	private ArrayList<Product> products = new ArrayList<>();
	
	/**
	 * Method that adds a product.
	 * @param product is the new product to be added.
	 */
	public void addProduct(Product product) {
		products.add(product);
	}
	
	/**
	 * Method that calculates each product price added to the products list.
	 * @return the total amount to pay for the list of products.
	 */
	public int calculatePrice() {
		return products.stream().map(p -> p.estimateRate()).reduce(0, (a, b) -> a + b);
	}
}
