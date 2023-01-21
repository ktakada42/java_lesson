public class PlaceRectangle2{
	Rectangle rec;
	int x;
	int y;
	PlaceRectangle2() {
		rec = new Rectangle();
		this.x = 0;
		this.y = 0;
	}
	PlaceRectangle2(int x, int y) {
		rec = new Rectangle();
		this.x = x;
		this.y = y;
	}
	PlaceRectangle2(int x, int y, int width, int height) {
		rec = new Rectangle();
		this.x = x;
		this.y = y;
		rec.width = width;
		rec.height = height;
	}
	@Override
	public String toString() {
		return "[ (" + x + ", " + y + ") [" + rec.width + ", " + rec.height + "]]";
	}
	public static void main(String[] args) {
		PlaceRectangle2 a = new PlaceRectangle2();
		PlaceRectangle2 b = new PlaceRectangle2(12, 34);
		PlaceRectangle2 c = new PlaceRectangle2(31, 41, 59, 26);
		PlaceRectangle2 d = new PlaceRectangle2(100, 200, 3, 4);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
