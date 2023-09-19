package mypackage.thread;

// Remove the unnecessary classes and reduce the lenghth of the code

/* For that we create a Annonymus class
 * Runnable is a functional interface
 */

// Anymore we don't want 'Hi' and 'Hello' classes

public class ThreadDemo4 {

	public static void main(String[] args) {

		// create an annonymus class as Runnable and give the implmentation inside the class body
		Runnable hi = new Runnable() {

			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		// create an annonymus class as Runnable and give the implmentation inside theclass body
		Runnable hello = new Runnable() {

			public void run() {

				for (int i = 0; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};

		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);

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