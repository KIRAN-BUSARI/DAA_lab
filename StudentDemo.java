import java.util.Scanner;

class Student {

  String name, usn, branch, ph_no;

  void readdata() { // To read the Data
    Scanner sobj = new Scanner(System.in);
    System.out.print("Enter Name of Student:");
    name = sobj.next();
    System.out.print("Enter USN of Student:");
    usn = sobj.next();
    System.out.print("Enter the Branch of Student:");
    branch = sobj.next();
    System.out.print("Enter the Phone Number of Student:");
    ph_no = sobj.next();
    System.out.println("\n");
  }

  void displaydata() { // To Display The Information
    System.out.println("Name= " + name);
    System.out.println("USN = " + usn);
    System.out.println("Branch= " + branch);
    System.out.println("Phone Number= " + ph_no);
    System.out.println("\n");
  }
}

public class studentDemo {

  public static void main(String args[]) {
    int n;

    System.out.println("Enter the Number of Students:");
    Scanner sobj = new Scanner(System.in);
    n = sobj.nextInt();
    // To Create Array of Object
    Student[] stobj = new Student[n];
    for (int i = 0; i < n; i++) {
      stobj[i] = new Student(); // initialize it zero by default constructor
    }
    for (int i = 0; i < n; i++) {
      stobj[i].readdata();
    }
    System.out.println("Information about Students is:\n");

    for (int i = 0; i < n; i++) {
      stobj[i].displaydata();
    }
  }
}
