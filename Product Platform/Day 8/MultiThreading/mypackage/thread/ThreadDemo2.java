package mypackage.thread;

/**
 * There are 2 ways to get Thread
 * 1. by extending the interface or by extending a class
 * 2. By implementing the interface which is Runnable
 * 
 * @author TK
 *
 */

// 1. by extending the interface or by extending a class

// When we call 'Start' method, it will call internally to 'Run' method
// This way it runs parallely 'Hi' and 'Hello' Ex: Hi  Hello Hi Hello

class Hii extends Thread {
	
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

class Helloo extends Thread {
	
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

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		Hii hii = new Hii();
		Helloo helloo = new Helloo();
		
		hii.start();
		helloo.start();
		
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

