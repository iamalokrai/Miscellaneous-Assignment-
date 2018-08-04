class Country {
	String name;
	double population;
	double area;

	// setting name of a country
	public void setName(String name) {
		this.name = name;
		// return this.name;
	}

	// setting population of a country
	public void setPopulation(double population) {
		this.population = population;
		// return this.population;
	}

	// setting area of a country
	public void setArea(double area) {
		this.area = area;
		// return this.area;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public double getPopulation() {
		return population;
	}

	// method to check the largest
	public static double largestArea(double area1, double area2) {
		double larea = area1 > area2 ? area1 : area2;
		return larea;
	}

	// method to find the largest population
	public static double largestPopulation(double pop1, double pop2) {
		double lpop = pop1 > pop2 ? pop1 : pop2;
		return lpop;
	}

	// method for getting highest population density
	static Country maxPopDensity(Country country1, Country country2) {
		Country country = new Country();
		if ((country1.getPopulation() / country1.getArea()) > (country2.getPopulation() / country2.getArea())) {
			country = country1;
		} else {
			country = country2;
		}
		return country;

	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", area=" + area + "]";
	}

}
