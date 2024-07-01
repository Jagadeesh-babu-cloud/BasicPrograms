package stackinterface;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stack=new Stack<>();

		stack.push(5);
		stack.push(10);
		stack.push(5);
		stack.push(null);
		stack.push(11);
		
		System.out.println(stack);

		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}
