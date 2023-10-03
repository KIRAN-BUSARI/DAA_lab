import java.util.Scanner;

public class divideException {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first number(numerator): ");
    int a = s.nextInt();
    System.out.print("Enter second number(denominator): ");
    int b = s.nextInt();
    try {
      if (b != 0) {
        int res = a / b;
        System.out.println("result=" + res);
      } else throw new ArithmeticException();
    } catch (ArithmeticException e) {
      System.out.println(
        "Divide by Zero Error...! Divisor cannot be Zero so please, reEnter the non-zero number...!"
      );
    }
  }
}
