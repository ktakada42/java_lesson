public class PlaceRectangle extends Rectangle {
	int x;
	int y;
	PlaceRectangle() {
		this.x = 0;
		this.y = 0;
	}
	PlaceRectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	PlaceRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "[ (" + x + ", " + y + ") [" + width + ", " + height + "]]";
	}
	public static void main(String[] args) {
		PlaceRectangle a = new PlaceRectangle();
		PlaceRectangle b = new PlaceRectangle(12, 34);
		PlaceRectangle c = new PlaceRectangle(31, 41, 59, 26);
		PlaceRectangle d = new PlaceRectangle(1, 2, 100, 200);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
