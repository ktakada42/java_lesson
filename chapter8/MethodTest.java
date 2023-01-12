public class MethodTest {
	public static String getYourName() {
		return ("結城浩");
	}
	public static void main(String[] args) {
		String fullName = getYourName();
		String familyName = fullName.substring(0, 2);
		String lastName = fullName.substring(2);
		System.out.println("名字は" + familyName);
		System.out.println("名前は" + lastName);
	}
	
}
