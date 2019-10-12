
public class StackUseClass {

	public static void main(String[] args) throws StackFullException,StackEmptyException {
		// TODO Auto-generated method stub
		Stackusingarray Stack = new Stackusingarray(5);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		Stack.push(5);
		Stack.push(6);
//		while(!Stack.isempty()) {
//			try {System.out.println(Stack.pop());
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		Stack.show();
		System.out.println("\n"+Stack.top());
	}

}
