// 19/6/23.
package DAA_lab;
import java.util.Scanner;
public class DivideException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number(numerator): ");
		int a =s.nextInt();
		System.out.println("Enter first number(denominator): ");
		int b = s.nextInt();
		try {
			if(b!=0) {
				int res = a/b;
				System.out.println("Result = "+res);
			}
			else
				throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero ERROR");
		}
	}

}