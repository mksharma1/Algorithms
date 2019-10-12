import java.util.Stack;

public class Stackusingarray {

	private int data[];
	private int top;

	public Stackusingarray() {
		// TODO Auto-generated constructor stub
		data = new int[10];
		top = -1;
	}

	public Stackusingarray(int len) {
		// TODO Auto-generated constructor stub
		data = new int[len];
		top = -1;
	}

	public boolean isempty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	public int size() {

		return top + 1;
	}

	public int top() throws StackEmptyException {
		if (size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int ele) throws StackFullException {
		// TODO Auto-generated method stub
		if(size()==data.length) {
			StackFullException e = new StackFullException();
		throw e;	
		}
		top++;
		data[top] = ele;
	}
	public int pop() throws StackEmptyException {
		if(isempty()) {
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		int temp=data[top];
		top--;
		return temp;	
	}
	
	public void show() {
		for(int n:data) {
			System.out.print(n+" ");
		}
	}
	
}
