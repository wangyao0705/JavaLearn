package dc005;
/**
 * 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author wy
 * @since 2020-05-25
 */
public class dc00503 {
	public static void main (String[]args) {

		//元配列
		int[]array=new int[] {1,2,6,7,9,6,2,1,1};

		//結果
		int max =array[0],min=array[0];
		float sum=0.0f;
		float average=0.0f;
		//最⼤値、最⼩値を求める。
		for (int i=0;i<array.length;i++) {
			//最大値判断
			if(max<array[i]) {
				max=array[i];
				//最小値判断
			}else if (min>array[i]) {
				min=array[i];
			}
			//和を求める。
			sum =sum+array[i];
		}
		//平均値を求める
		average =sum/array.length;
		//結果出力
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(average);
	}
}
