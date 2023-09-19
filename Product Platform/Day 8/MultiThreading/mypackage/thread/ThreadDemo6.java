package mypackage.thread;

// Reduce the length using Lambda Expression

// Also we don't need to create any object for classes and we can directly proceed following way

public class ThreadDemo6 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {

			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

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