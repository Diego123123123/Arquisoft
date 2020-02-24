/**
 * Universidad Catolica Boliviana "San Pablo"
 * @author Diego Orlando Mejia Salazar
 *
 */
public class Article extends ProductImp{
	
	/**
	 * Constructor method that sets up estimation behaviour
	 */
	public Article() {
		setEstimation(new ArticleEstimation());
	}
	
	/**
	 * Method that checks if an amount of articles are available
	 * @param amount of articles to check
	 * @return true if the amount is available
	 */
	@Override
	public boolean isAvailable(int amount) {
		if (amount > 5) {
			return false;
		}
		return true;
	}
}
