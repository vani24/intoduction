package Training;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StackExample stack=new StackExample();
		stack.push(10);
		stack.push(11);
		stack.push(40);
		stack.push(30);
		stack.push(45);
		stack.push(80);
		System.out.println(stack.pop()+" Popped from the array ");
		stack.display();
		System.out.println("top element is :"+stack.peek());
	}
	static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    StackExample()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    int peek() {
    	
    	return a[top];
    }
  public void display() {  
    System.out.println("content of statck.");
    int temp=top;
    while(temp>-1) {
    	System.out.println(a[temp]);
    	temp--;
    }
  }

}
