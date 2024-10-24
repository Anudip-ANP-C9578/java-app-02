import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

/*
*creating a class name as App
*/
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision division = new TwoNonDecimalNumbersDivision();

		/*
		 * input as per the task given
		 */
		System.out.println(division.divide(10, 2)); // Expected Output: 5.0
		System.out.println(division.divide(10, 3)); // Expected Output: 3.3333333333333335
		System.out.println(division.divide(10, 4)); // Expected Output: 2.5
		System.out.println(division.divide(2, 10)); // Expected Output: 0.2
		System.out.println(division.divide(10, -2)); // Expected Output: -1.0
		System.out.println(division.divide(-10, 2)); // Expected Output: -1.0
		System.out.println(division.divide(-10, -2));// Expected Output: -1.0
		System.out.println(division.divide(10, 0)); // Expected Output: -2.0
		System.out.println(division.divide(0, 2)); // Expected Output: -2.0
		System.out.println(division.divide(0, 0)); // Expected Output: -2.0
	}
}
