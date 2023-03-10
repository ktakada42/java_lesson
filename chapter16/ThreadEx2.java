public class ThreadEx2 extends Thread {
	public static void main(String[] args) {
		new Thread(new ThreadAsterisk2()).start();
		new Thread(new ThreadEqual2()).start();
	}
}

class ThreadAsterisk2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println("***");
		}
	}
}

class ThreadEqual2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println("====");
		}
	}
}
