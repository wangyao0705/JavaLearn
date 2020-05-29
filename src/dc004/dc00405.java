package dc004;

public class dc00405 {
	public static void main(String[] args) {

		int[] array = new int[] { -1, 3, 5, 7, 100, 0, 1 };
		int max = 0;
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
