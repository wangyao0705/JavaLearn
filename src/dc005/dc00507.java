package dc005;

import java.util.Arrays;

public class dc00507 {
	public static void main(String[] args) {
		int[] array = new int[] { 6, 5, 9, 3, 8, 1, 3, 2 };
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					num = array[i];
					array[i] = array[j];
					array[j] = num;
					System.out.println(Arrays.toString(array));
				} /*例如简一点的冒泡排序，
					将第一个数字和后面的数字逐个比较大小，如果大于，则互换位置，小于则不动
					。此时，第一个数为数组中的最小数。
					然后再将第二个数与后面的数逐个比较，以次类推。*/
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println(Arrays.toString(array));
		//		for (int i = 0; i < array.length; i++) {
		//			System.out.println(array[i] );
		//		}
	}
}
