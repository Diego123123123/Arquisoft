/**
 * Service estimation behaviour.
 * @author Diego Orlando Mejia Salazar
 *
 */
public class ServiceEstimation implements Estimation {

	@Override
	public int estimate(int price) {
		return price * 2;
	}

}
