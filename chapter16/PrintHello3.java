class LabelPrinter extends Thread {
	String label = "no label";
	LabelPrinter(String label) {
		this.label = label;
	}	
	@Override
	public void run() {
		while (true) {
			System.out.println(label);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

public class PrintHello3 {
	public static void main(String[] args) {
		LabelPrinter th = new LabelPrinter("おはよう！");
		LabelPrinter th2 = new LabelPrinter("こんにちは！");
		LabelPrinter th3 = new LabelPrinter("こんばんは！");
		th.start();
		th2.start();
		th3.start();
	}
}