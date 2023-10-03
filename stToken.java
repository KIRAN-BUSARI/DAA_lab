import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {

  String cName, dob;
  Scanner sobj = new Scanner(System.in);

  void read() {
    System.out.println("Enter Customer name:");
    cName = sobj.next();
    System.out.println("Enter Customer DOB in the format dd/mm/yyyy");
    dob = sobj.next();
  }

  void display() {
    StringTokenizer st = new StringTokenizer(dob, "/");
    System.out.print(cName + ",");
    while (st.hasMoreTokens()) {
      String val = st.nextToken();
      System.out.print(val);
      if (st.countTokens() != 0) System.out.print("," + " ");
    }
  }
}

public class stToken {

  public static void main(String[] args) {
    Customer cobj = new Customer();
    cobj.read();
    System.out.println("Customer Details");
    System.out.println("---------------------");
    cobj.display();
  }
}
