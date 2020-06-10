package dca005;
/**
 * 質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author wy
 * @since 2020-05-25
 */

public class D04 {
	public int  repeat (int[] z) {
		int res = 0;
		for(int i=0;i<z.length;i++) {
			for (int j=0;j<z.length;j++) {
				if(z[i]==z[j]) {
					res=z[i];
				}
			}
		}
		return res;

	}

}
