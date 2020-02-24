import java.util.ArrayList;

public class Sale {
	private ArrayList<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public int calculatePrice() {
		return products.stream().map(p -> p.estimateRate()).reduce(0, (a, b) -> a + b);
	}
}
