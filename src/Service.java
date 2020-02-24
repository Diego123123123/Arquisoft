/**
 * Service product
 * @author Diego Orlando Mejia Salazar
 *
 */
public class Service extends ProductImp{

	/**
	 * Method that checks availability of a service
	 * @param amount to check if is available
	 */
	@Override
	public boolean isAvailable(int amount) {
		if(amount > 2) {
			return false;
		}
		return true;
	}
	
	/**
	 * Method that sets up estimation
	 */
	public Service() {
		setEstimation(new ServiceEstimation());
	}

}
