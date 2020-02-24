import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServiceTest {
	
	private ProductImp service = new Service();
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void amountTestWith1() throws Exception {
		service.setPrice(1);
		assertThat(service.estimateRate(), is(2));
	}
	
	@Test
	public void amountTestWith20() throws Exception {
		service.setPrice(20);
		assertThat(service.estimateRate(), is(40));
	}
	
	@Test
	public void checkName() {
		service.setName("Cocacola mini");
		assertThat("Cocacola mini", is(service.getName()));;
	}
	
	@Test
	public void amountTestWithNegativeValue() throws Exception {
		expectedException.expect(Exception.class);
		service.setPrice(-1);
	}

}
