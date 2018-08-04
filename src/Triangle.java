//class triangle having its setter and getter method
public class Triangle {
	int side1;
	int side2;
	int side3;

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	// method to check if the triangle is right or not
	public boolean isRight(int side1, int side2, int side3) {
		if (side3 * side3 == Math.sqrt((side2 * side2) + (side1 * side1))) {
			return true;
		} else
			return false;
	}

	// method to check if the triangle is scalen on not
	public boolean isScalen(int side1, int side2, int side3) {
		if (side1 != side2 && side2 != side3) {
			return true;
		} else
			return false;
	}

	// method to check if the triangle is isoceles or not
	public boolean isIsoceles(int side1, int side2, int side3) {
		if (side1 == side2 && side2 != side3) {
			return true;
		} else
			return false;
	}

	// method to check if the triangle is equilateral or not
	public boolean isEquilateral(int side1, int side2, int side3) {
		if (side1 == side2 && side2 == side3) {
			return true;
		} else
			return false;
	}

}
