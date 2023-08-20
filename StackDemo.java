// 12/6/23
package DAA_lab;
import java.util.Scanner;
class Stack{
	int size = 10;
	int arr[] = new int[size];
	int top = -1;
	void push(int item) {
		if(top == size-1) {
			System.out.println("Error !! Stack is OverFlow");
		}
		else {
			top++;
			arr[top] = item;
			System.out.println("The Item \t"+item+"Is Pushed on to the stack");
		}
	}
	void pop() {
		if(top == -1) {
			System.out.println("Error !! Stack is Underflow");
		}
		else {
			int item;
			item = arr[top];
			System.out.println("The Item \t"+item+"Is Poped from the stack");
			top--;
		}
	}
	void display() {
		if(top == -1) {
			System.out.println("Error !! Stack is Underflow");
		}
		else {
			System.out.println("Stack Elements are :");
			for(int i=0;i<=top;i++) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
public class StackDemo {
	public static void main(String[] args) {
		Stack stk = new Stack();
		int x;
		Scanner s = new Scanner(System.in);
		int ch;System.out.println("1.Push\n 2.Pop\n 3. Display\n 4.Exit");
		do {
			System.out.println("Enter your choice:");
			ch = s.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter element :");
			x = s.nextInt();
			stk.push(x);
			break;
			case 2: stk.pop();
			break;
			case 3: stk.display();
			break;
			case 4: System.exit(0);
			default : System.out.println("Please enter correct number");
		}
	}while(ch!=4);
	}

}
