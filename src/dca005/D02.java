package dca005;
/**
 * 5の階乗を求める(for)
 * @author wy
 * @since 2020-05-25
 * @version 2.0
 */

public class D02 {
	public  int mul(int z) {
		int mul =1;
		for(int i=1;i<=z;i++) {
			mul=mul*i;
		}
		return mul;
	}
public static void main(String[]args) {
	D02 mul =new D02();
	mul.mul(5);
	System.out.println(mul.mul(5));
}
}
