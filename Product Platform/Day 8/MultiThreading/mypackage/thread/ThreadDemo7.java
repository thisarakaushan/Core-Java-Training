package mypackage.thread;

// Join

// isAlive()

public class ThreadDemo7 {

	public static void main(String[] args) throws Exception {

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

		/**
		 * isAlive():-
		 * 
		 * It is the method that uses for detecting the thread is in running state or not.
		 */
		System.out.println(t1.isAlive());
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		
		/* Join:-
		 * 
		 * It will make that main thread to wait for t1, t2 to join again
		 * Join will wait to join the main thread.
		 */
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}
}

/**
 * 
 * Output:
 * 
 false
 true
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
 false
 Bye
 * 
 */