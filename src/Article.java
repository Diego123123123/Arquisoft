
public class Article extends ProductImp{
	
	public Article() {
		setEstimation(new ArticleEstimation());
	}
	
	@Override
	public boolean isAvailable(int amount) {
		if (amount > 5) {
			return false;
		}
		return true;
	}
}
