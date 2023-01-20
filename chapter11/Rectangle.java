public class Rectangle {
	final int INITIAL_WIDTH = 10;
	final int INITIAL_HEIGHT = 20;
	int width;
	int height;
	int x;
	int y;
	Rectangle() {
		this.width = INITIAL_WIDTH;
		this.height = INITIAL_HEIGHT;
	}
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	void SetLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "[" + x + ", " + y + ", " + width + ", " + height + "]";
	}
	Rectangle intersect(Rectangle r) {
		int lx = Math.min((this.x + this.width), (r.x + r.width));
		int rx = Math.max(this.x, r.x);
		int uy = Math.max(this.y, r.y);
		int dy = Math.min((this.y + this.height), (r.y + r.height));
		int newWidth = lx - rx;
		int newHeight = dy - uy;
		if (newWidth > 0 && newHeight > 0) {
			return new Rectangle(rx, uy, newWidth, newHeight);
		} else {
			return (null);
		}
	}

	public static void main(String[] args) {
		Rectangle a, b, c, d, e;
		a = new Rectangle(0, 0, 20, 10);
		b = new Rectangle(5, 5, 20, 10);
		c = new Rectangle(20, 10, 20, 10);
		d = new Rectangle(-10, -20, 100, 200);
		e = new Rectangle(21, 11, 20, 10);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("aとaの重なり = " + a.intersect(a));
		System.out.println("aとbの重なり = " + a.intersect(b));
		System.out.println("aとcの重なり = " + a.intersect(c));
		System.out.println("aとdの重なり = " + a.intersect(d));
		System.out.println("aとeの重なり = " + a.intersect(e));
	}
}
