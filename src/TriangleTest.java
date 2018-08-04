import java.util.*;

//class to implements all the methods
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Triangle triangle = new Triangle();

		System.out.println("Enter the three sides of triangle:");

		// Getting all the 3 sides of the triangle
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();

		// Setting the sides of the triangle
		triangle.setSide1(side1);
		triangle.setSide2(side2);
		triangle.setSide3(side3);

		System.out.println("Chose what you want to check-");
		System.out.println("1. Is Right or not.");
		System.out.println("2. Is Scalen or not");
		System.out.println("3. Is Issoceles or not.");
		System.out.println("4. Is Equilateral or not.");
		System.out.println("Please enter your choice (1 or 2 or 3 or 4 ) -");
		int n = scanner.nextInt();

		// using switch case to check several options
		switch (n) {
		case 1:
			boolean result = triangle.isRight(side1, side2, side3);
			System.out.println(result);
			break;

		case 2:
			result = triangle.isScalen(side1, side2, side3);
			System.out.println(result);
			break;

		case 3:
			result = triangle.isIsoceles(side1, side2, side3);
			System.out.println(result);
			break;

		case 4:
			result = triangle.isEquilateral(side1, side2, side3);
			System.out.println(result);
			break;

		default:
			System.out.println("Invalid Input.");
		}
		scanner.close();
	}

}
