package dca005;

public class D01 {
	public int sum(int z) {
		int sum=0;
		for(int i=1;i<=z;i++) {
			if (i%2==0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
		return sum;
	}
	public static void main(String[]args) {

	D01 sum=new D01();
	sum.sum(100);
	System.out.println(sum.sum(100));
	}
}


