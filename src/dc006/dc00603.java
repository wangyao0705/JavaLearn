package dc006;

public class dc00603 {
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 2, 4, 6, 4, 6, 8, 6 };
		int max = max(array);
		int min = min(array);
		int sum = sum(array);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
