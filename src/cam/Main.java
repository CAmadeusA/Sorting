package cam;

import java.util.Arrays;

public class Main {

	private static int length;

	public static void main(String[] args) {
		int array[] = new int[10000];
		Main.sort(array);

	}

	public static int[] sort(int[] numbers) {

		int array[] = Main.randomarraygen(numbers);

		if (array == null || array.length == 0) {
			return null;
		}
		length = array.length;

		for (int j = 1; j < length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}

		System.out.println("The Sorted array is: ");
		System.out.print(Arrays.toString(array));
		return array;

	}

	public static int[] randomarraygen(int[] numbers) {
		numbers = new int[10000];

		for (int i = 0; i < numbers.length; i++) {
			int num = (int) (Math.random() * 1000);

			numbers[i] = num;

		}

		System.out.println("The List is: ");
		System.out.print(Arrays.toString(numbers));
		System.out.println("");

		return numbers;
	}

}
