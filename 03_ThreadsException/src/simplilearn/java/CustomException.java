package simplilearn.java;

class MyException2 extends Exception {
	String str1;

	public MyException2(String str2) {
		str1 = str2;
	}

	@Override
	public String toString() {
		return ("MyException Occurred:" + str1);
		// jjj
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException2("This is My error Message");
			
		} catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}

}
