

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArticleTest {
	

	private ProductImp article = new Article();
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void amountTestWith1() throws Exception {
		article.setPrice(1);
		assertThat(article.estimateRate(), is(10));
	}
	
	@Test
	public void amountTestWith20() throws Exception {
		article.setPrice(20);
		assertThat(article.estimateRate(), is(200));
	}
	
	@Test
	public void checkName() {
		article.setName("Cocacola mini");
		assertThat("Cocacola mini", is(article.getName()));;
	}
	
	@Test
	public void amountTestWithNegativeValue() throws Exception {
		expectedException.expect(Exception.class);
		article.setPrice(-1);
	}
}
