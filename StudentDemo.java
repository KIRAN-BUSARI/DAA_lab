import java.util.Scanner;

class Student {

  String name, usn, branch, ph_no;

  void readdata() {
    Scanner sobj = new Scanner(System.in);
    System.out.print("Enter name of Student");
    name = sobj.next();
    System.out.print("Enter USN of Student");
    usn = sobj.next();
    System.out.print("Enter BRANCH of Student");
    branch = sobj.next();
    System.out.print("Enter phone_no of Student");
    ph_no = sobj.next();
  }

  void printdata() {
    System.out.println("Name :" + name);
    System.out.println("USN :" + usn);
    System.out.println("Branch :" + branch);
    System.out.println("Ph_no :" + ph_no);
  }
}

public class StudentDemo {

  public static void main(String[] args) {
    int n;
    System.out.println("Enter the No. of students :");
    Scanner sobj = new Scanner(System.in);
    n = sobj.nextInt();
    // To create array
    Student[] stobj = new Student[n];
    for (int i = 0; i < n; i++) {
      stobj[i] = new Student(); //TO initialize it by zero by default constructor
    }
    for (int i = 0; i < n; i++) {
      stobj[i].readdata();
    }
    System.out.println("Information of students are: \n");
    for (int i = 0; i < n; i++) {
      stobj[i].printdata();
    }
  }
}
