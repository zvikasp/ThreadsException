package simplilearn.java;

public class TryCatchDemo {

	public static void main(String[] args) {
		int[] array = new int[3];
		try {
			array[7] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds!");
		}
		finally {
			System.out.println("The array is of size " + array.length);
		}
	}

}
