// 12/6/23.
package DAA_lab;
import java.util.Scanner;
class Staff{
	String sid,name,ph;
	float sal;
	void getdetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ID :");
		sid = s.next();
		System.out.println("Enter Name :");		
		name = s.next();
		System.out.println("Enter Ph_no :");
		ph = s.next();
		System.out.println("Enter salary :");
		sal = s.nextFloat();
	}
	void putdetails() {
		System.out.println("------------------Staff Details are-----------------\n");
		System.out.println("Staff ID is :"+sid);
		System.out.println("Staff Name is :"+name);
		System.out.println("Staff PH_no is :"+ph);
		System.out.println("Staff Salary is :"+sal);
		System.out.println("----------------------------------------------------\n");
	}
}
	class Teaching extends Staff{
		String dom,pub;
		Teaching(){
			getdetails();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Domain :");
			dom = s.next();
			System.out.println("Enter Publications :");
			pub = s.next();
		}
		void dispTeach() {
			putdetails();
			System.out.println("Staff Domain is :"+dom);
			System.out.println("Staff Publications :"+pub);
		}
	}
	class Technical extends Staff{
		String skills;
		Technical(){
			getdetails();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Skills :");
			skills = s.next();
		}
		void dispTech() {
			putdetails();
			System.out.println("Skills of the Staff "+skills);
		}
	}
	class Contract extends Staff{
		int period;
		Contract (){
			getdetails();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter contract period in years :");
			period = s.nextInt();
		}
		void dispcontract() {
			putdetails();
			System.out.println("Staff contract period is :"+period+"years");
		}
	}

public class StaffDemo {
	public static void main(String[] args) {
		System.out.println("Enter the details of Teaching Staff :");
		Teaching t1 = new Teaching();
		System.out.println("Enter the details of Technical Staff :");
		Technical t2 = new Technical();
		System.out.println("Enter the details of contract Based Staff :");
		Contract c = new Contract();
		System.out.println("Teaching Staff :");
		t1.dispTeach();
		System.out.println("Technical Staff :");
		t2.dispTech();
		System.out.println("Contract based Staff :");
		c.dispcontract();
	}
}