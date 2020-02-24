import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SaleTest {
	private Sale sale;
	
	@Test
	public void addSaleASingleProduct() throws Exception {
		sale = new Sale();
		Service tvService = new Service();
		tvService.setPrice(10);
		sale.addProduct(tvService);
		assertThat(20, is(sale.calculatePrice()));
	}
	
	@Test
	public void addSaleTwoProducts() throws Exception {
		sale = new Sale();
		Service tvService = new Service();
		tvService.setPrice(10);
		sale.addProduct(tvService);
		Article article1 = new Article();
		article1.setPrice(5);
		sale.addProduct(article1);
		assertThat(70, is(sale.calculatePrice()));
	}
	
	@Test
	public void addSaleThreeProducts() throws Exception{
		sale = new Sale();
		Service tvService = new Service();
		tvService.setPrice(10);
		sale.addProduct(tvService);
		Article article1 = new Article();
		article1.setPrice(5);
		sale.addProduct(article1);
		Article article2 = new Article();
		article2.setPrice(3);
		sale.addProduct(article2);
		assertThat(100, is(sale.calculatePrice()));		
	}
	
}
