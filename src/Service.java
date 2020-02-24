/**
 * Service product
 * @author Diego Orlando Mejia Salazar
 *
 */
public class Service extends ProductImp{

	@Override
	public boolean isAvailable(int amount) {
		if(amount > 2) {
			return false;
		}
		return true;
	}
	
	public Service() {
		setEstimation(new ServiceEstimation());
	}

}
