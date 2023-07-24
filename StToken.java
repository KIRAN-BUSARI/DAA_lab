// 19/6/23.
package DAA_lab;
import java.util.Scanner;
import java.util.StringTokenizer;
class Customer{
	String cname,dob;
	Scanner s = new Scanner(System.in);
	void read() {
		System.out.println("Enter Customer name: ");
		cname = s.next();
		System.out.println("Enter Customer DOB in dd/mm/yyyy Format");
		dob = s.next();
	}
	void display() {
		StringTokenizer st = new StringTokenizer(dob,"/");
		System.out.print(cname+",");
		while(st.hasMoreTokens()) {
			String val = st.nextToken();
			System.out.print(val);
			if(st.countTokens() != 0) {
				System.out.print(","+" ");
			}
		}
	}
}
public class StToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.read();
		c.display();
	}

}