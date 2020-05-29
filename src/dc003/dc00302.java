package dc003;

public class dc00302 {

	public static void main (String[] args) {
		int sum=3348;
		if (sum>=500) {
			System.out.println(sum/500);
		}
		sum=sum%500;
		if(sum>=100) {
			System.out.println(sum/100);
		}
		sum=sum%100;
		if(sum>=10) {
			System.out.println(sum/10);
		}
		sum=sum%10;
		if (sum>=5) {
			System.out.println(sum/5);
		}
		sum=sum%5;
		if (sum>=1) {
			System.out.println(sum/1);
		}

	}

}
