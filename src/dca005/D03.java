package dca005;

/**
 * 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author wy
 * @since 2020-05-25
 */
public class D03 {

	public int max(int[] z) {
		int max = z[0];
		for (int i = 0; i < z.length; i++) {
			if (max < z[i]) {
				max = z[i];
			}
		}
		return max;
	}

	public int min(int[] z) {
		int min = z[0];
		for (int i = 0; i < z.length; i++) {
			if (min > z[i]) {
				min = z[i];
			}
		}
		return min;
	}


	public float avg(int[] z) {
		float sum = 0;
		float average = 0;
		for (int i = 0; i < z.length; i++) {
			sum = sum + z[i];
		}
		average = sum / z.length;

		System.out.println(average);
		return average;
	}
}
