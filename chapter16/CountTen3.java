public class CountTen3 extends Thread {
	public static void main(String[] args) {
		new CountTen3().start();
		new CountTen3().start();
		new CountTen3().start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + ":i = " + i);
		}
	}
}
