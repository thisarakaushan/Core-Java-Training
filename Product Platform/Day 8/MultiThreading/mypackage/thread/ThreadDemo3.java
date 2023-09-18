package mypackage.thread;

/**
 * There are 2 ways to get Thread
 * 1. by extending the interface or by extending a class
 * 2. By implementing the interface which is Runnable
 * 
 * @author TK
 *
 */

// 2. By implementing the interface which is Runnable

class Hiii implements Runnable {
	
	public void run() {
		for(int i = 0; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hellooo implements Runnable {
	
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadDemo3 {
	
	public static void main(String[] args) {
		
		/* 
		 'hii' and 'helloo' are the objects of Runnable
		 Instead of 'Hii' and 'Helloo', we can write as Runnable
		 Because we can to the reference of interface
		 Runnable hi = new Hii();
		 Runnable hello = new Helloo();
		 */
		Hiii hii = new Hiii();
		Hellooo helloo = new Hellooo();
		
		// Runnable doesn't have start method, that's why we want create a Thread object
		// Also we want to link this thread with our class object, if not output will null.
		Thread t1 = new Thread(hii);
		Thread t2 = new Thread(helloo);
				
		t1.start();
		t2.start();
		
	}
}

/**
 * 
 * Output:
 * 
 Hi
 Hello
 Hi
 Hello
 Hi
 Hello
 Hi
 Hello
 Hi
 Hello
 * 
 */

