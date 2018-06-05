package Training;

public class CircularQueue {
	private int size;
    private int head;
    private int tail;
    private int array[];
    public CircularQueue(int initialCapacity) {
        size = initialCapacity;
        array = new int[initialCapacity];
        initialize();
    }
    public synchronized void initialize() {
        head = 0;
        tail = 0;
    }
    public synchronized void enqueue(int v) throws Exception {
        int tmp = (tail+1) % size;
        if (tmp == head) {
        	resizeQueue();
            array[tail] = v;
            
        }else{
            array[tail] = v;
            tail = tmp;
        }
        System.out.println(v+ " enqueued to queue");
    }
    public synchronized int dequeue() throws Exception{
        if (head == tail) throw new Exception("Empty Queue!");
        int tmp = array[head];
        array[head] = 0;  // Zero is just an arbitrary value, Just to simulate a clean up of the current slot
        head = (head + 1) % size;
        return tmp;
    }
    public void resizeQueue()throws Exception{
    	
    	size = size*2;
    	int tmp []= new int[size];
    	int index = 0;
    	
    	while(head != tail){
    		tmp[index++] = dequeue();
    	}
    	head = 0;
    	tail = index;
    	array = tmp;
    }
    /*public void printQueue(){
    	if( tail == head){
    		System.out.println("Empty Queue!");
    	}
    	for(int i = 0 ; i < array.length ; i++){
    	if(i == tail)
    			System.out.print("Tail->[" +array[i] +"],");
    		else if(i == head)
    			System.out.print("head->[" +array[i] +"],");
    		else
    			System.out.print("["+array[i]+"],");
    	}
    
    }*/
    
    public static void main(String [] args) throws Exception{
    	CircularQueue myQueue = new CircularQueue(5);
    	myQueue.enqueue(1);
    	myQueue.enqueue(2);
    	myQueue.enqueue(3);
    	myQueue.enqueue(4);
    	myQueue.enqueue(5);
    	myQueue.enqueue(6);
        System.out.println(myQueue.dequeue() + 
                " dequeued from queue\n");
  
        System.out.println(myQueue.dequeue() + 
                " dequeued from queue\n");
  
        System.out.println(myQueue.dequeue() + 
                " dequeued from queue\n");
  
    	

       // myQueue.printQueue();
    }

}
