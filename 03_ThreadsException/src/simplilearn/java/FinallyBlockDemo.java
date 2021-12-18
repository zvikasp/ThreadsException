package simplilearn.java;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		int a = 45, b = 0, rs = 0;
		try {
			rs = a / b;
		} catch (ArithmeticException e) {
			System.out.println("\n\tError:" + e.getMessage());
		} finally {
			System.out.println("\n\tThe result is:" + rs);
		}
	}
}
