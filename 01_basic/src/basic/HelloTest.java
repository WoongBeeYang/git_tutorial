package basic;

public class HelloTest {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.print("Hello Java!!\n");
		System.out.println(25 + 36);
		System.out.println("25 + 36");
		System.out.println("25 + 36 ="+ (25 + 36));
		System.out.println("25 / 36 ="+ (25 / 36));
		System.out.println("25 / 36 ="+ (25.0 / 36));
		System.out.println("25 / 36 ="+ ((double)25 / 36));
		System.out.println("25 / 36 ="+ String.format("%.3f", (double)25 / 36));
	}
}
