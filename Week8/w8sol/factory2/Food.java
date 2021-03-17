public abstract class Food {

	private String name;
	private int calories;

	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	public String eat() {
		return "bite chew chew";
	}

	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}
}
