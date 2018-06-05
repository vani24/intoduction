package Training;

public class MyStack<T extends Object> {
	private int stackSize;
	private T[] stackArr;
	private int top;
	 @SuppressWarnings("unchecked")
	public MyStack(int size) {
		this.stackSize=size;
		this.stackArr=(T[]) new Object[stackSize];
		this.top=-1;
		
	}
	
	public void push(T entry) {
		if(this.isStackFull()) {
			System.out.println("Stack is full . Increasing the capacity");
			this.increaseCapacity();
			
		}
		System.out.println("Adding: "+entry);
		this.stackArr[++top]=entry;
	}
	
	public T pop() {
		if(this.isStackEmpty()) {
			System.out.println("Stack is empty cannot move emelement");
		}
		T entry=this.stackArr[top--];
		System.out.println("Removed : "+entry);
		return entry;
		
	}
	
	public T peek() {
	    return stackArr[top];
	}
	
	private void increaseCapacity() {
		 @SuppressWarnings("unchecked")
		T[] newStack=(T[]) new Object[this.stackSize*2];
		for(int i=0;i<stackSize;i++) {
			newStack[i]=this.stackArr[i];
			
		}
		this.stackArr=newStack;
		this.stackSize=stackSize*2;
	}
	
     public boolean isStackEmpty() {
    	 return (top == -1);
    	 
     }
     public boolean isStackFull() {
    	 return(top == stackSize-1);
     }
     
     public void display() {  
    	    System.out.println("content of statck.");
    	    int temp=top;
    	    while(temp>-1) {
    	    	System.out.println(stackArr[temp]);
    	    	temp--;
    	    }
    	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyStack<String> stringStack = new MyStack<String>(2);
	        stringStack.push("abc");
	        stringStack.push("bcd");
	        stringStack.push("cde");
	        stringStack.push("def");
	        stringStack.push("efg");
	        stringStack.push("fgh");
	        System.out.println(stringStack.pop()+" Popped from the array ");
	        stringStack.display();
			System.out.println("top element is :"+stringStack.peek());
	        System.out.println("--------------------------------------------");
	        MyStack<Integer> integerStack = new MyStack<Integer>(2);
	        integerStack.push(23);
	        integerStack.push(10);
	        integerStack.push(11);
	        integerStack.push(40);
	        integerStack.push(30);
	        integerStack.push(45);
	        integerStack.push(80);
			System.out.println(integerStack.pop()+" Popped from the array ");
			integerStack.display();
			System.out.println("top element is :"+integerStack.peek());
			System.out.println("-------------------------------------------------");
			 MyStack<Character> charStack = new MyStack<Character>(2);
			 charStack.push('a');
			 charStack.push('b');
			 charStack.push('c');
			 charStack.push('d');
			 charStack.push('e');
			 charStack.push('f');
			 charStack.push('g');
				System.out.println(charStack.pop()+" Popped from the array ");
				charStack.display();
				System.out.println("top element is :"+charStack.peek());
			System.out.println("------------------------------------------------");
			

	}

}
