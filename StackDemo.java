import java.util.Scanner; //Scanner Method means to read the values from keyboard

class Stack {

  int size = 10;
  int arr[] = new int[size];
  int top = -1;

  void push(int item) {
    if (top == size - 1) {
      System.out.println("Error !Stack Overflow ");
    } else {
      top++;
      arr[top] = item;
      System.out.println("The Item\t " + item + "\t is pushed on to the stack");
    }
  }

  void pop() {
    if (top == -1) {
      System.out.println("ERROR!!! stack underflow");
    } else {
      int item;
      item = arr[top];
      System.out.println(
        "The Item\t" + arr[top] + "\tis poped out of the stack"
      );
      top--;
    }
  }

  void display() {
    if (top == -1) {
      System.out.println("Stack Empty ");
    } else {
      System.out.println("Elements in stack ");
      for (int i = 0; i <= top; i++) {
        System.out.println(arr[i]);
      }
    }
  }
}

// Main Method class
public class stackDemo {

  public static void main(String args[]) {
    Stack stk = new Stack();
    int x;
    Scanner s = new Scanner(System.in);
    int ch;
    System.out.println("Enter 1: to push element");
    System.out.println("Enter 2: to pop element");
    System.out.println("Enter 3: to display elements");
    System.out.println("Enter 4: to Exit ");
    do {
      System.out.println("Enter your choice: ");
      ch = s.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter element:");
          x = s.nextInt();
          stk.push(x);
          break;
        case 2:
          stk.pop();
          break;
        case 3:
          stk.display();
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Please Enter correct choice");
      }
    } while (ch != 4);
  }
}
