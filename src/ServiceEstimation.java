/**
 * Service estimation behaviour.
 * @author Diego Orlando Mejia Salazar
 *
 */
public class ServiceEstimation implements Estimation {

	/**
	 * Price estimation
	 * @param price is the price of the service.
	 */
	@Override
	public int estimate(int price) {
		return price * 2;
	}

}
