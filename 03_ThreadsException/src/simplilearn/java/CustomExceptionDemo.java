package simplilearn.java;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		try {
			throw new MyException("temp");
		} catch (MyException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
}
