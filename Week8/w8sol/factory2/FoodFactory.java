// http://www.oodesign.com/factory-pattern.html
// Use factory1 example's FruitFactory.java as reference
public class FoodFactory {
	
	// COMPLETE THIS CLASS

	public Food createProduct(String product) {
		if (product.equals("Burger"))
			return new Burger();
		if (product.equals("Pizza"))
			return new Pizza();
		if (product.equals("Salad"))
			return new Salad();
		return null;
	}
	
}
