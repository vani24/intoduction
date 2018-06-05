package crackingtheCoding;

public class ThreadDeadLock {
	
	static String resource1 = "printer";
	static String resource2 = "keyboard";
	static String resource3 = "mouse";

	private static class Threadclass1 extends Thread {

		public void run() {
			synchronized (resource1) {// thread 1 lock on res1
				System.out.println("Thread 1: locked resource 1="+resource1);

			/*	try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}*/
				synchronized (resource2) {//free
					System.out.println("Thread 2: locked resource 2="+resource2);
					synchronized (resource3) {
						System.out.println("Thread 3: locked resource 3="+resource3);
					}
				}
				
			}
		}
	}
	
	
	private static class Threadclass2 extends Thread {

		public void run() {
			synchronized (resource2) { // thread 2 lock on res2----------------> waiting
				System.out.println("Thread 2: locked resource 3="+resource3);

				/*try {
				Thread.sleep(100);
				} catch (Exception e) {}*/
				synchronized (resource3) {
					System.out.println("Thread 3: locked resource 1="+resource1);
					synchronized (resource1) {
						System.out.println("Thread 1: locked resource 2="+resource2);
					}
				}
			}
		}
	}
	
	private static class Threadclass3 extends Thread {

		public void run() {
			synchronized (resource3) { // thread 2 lock on res2----------------> waiting
				System.out.println("Thread 3: locked resource 2="+resource2);

				/*try {
				Thread.sleep(100);
				} catch (Exception e) {}*/
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 3="+resource3);
					synchronized (resource2) {
						System.out.println("Thread 2: locked resource 1="+resource1);
					}
				}
			}
		}
	}
	
	public static void main(String args[]){
		Threadclass1 t1=new Threadclass1();
		Threadclass2 t2=new Threadclass2();
		Threadclass3 t3=new Threadclass3();
		t1.start();
		t2.start();
		t3.start();
	}
}
