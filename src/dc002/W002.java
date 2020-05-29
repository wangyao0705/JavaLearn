package dc002;

public class W002{
	public static void main (String[] args) {
		int a=10;
		int b =20;
		if (a > b) {
			System.out.println("aはbより大きい");
		} else if ( a == b) {
			System.out.println("aはｂ 等しい");
		}else {
			System.out.println("bはaより大きい");
		}

		int  c=1;
		switch (c) {
		case 1 :
			System.out.println("c=1");
			break;
		case 10:
			System.out.println("c=10");
			break;
		default:
			System.out.println("default");
			break;
		}

		int d =9;
		if(d==1) {
			System.out.println("d=1");
		} else if (d==10) {
			System.out.println("d=10");
		} else {
			System.out.println("default");
		}

		for (int e=0; e<10; e++) {
			System.out.println(e);
		}
		int f=0;
		for (;f<10; ) {
			System.out.println(f);
			f++;
		}
		int g=0;
		for (;;) {
			System.out.println(g);
			if (g>=10) {
				break;
			}
			g++;
		}

		int h=0;
		while (h<10) {
			System.out.println(h);
			h++;
		}
		while (true) {
			System.out.println(h);
			if (h>=10) {
				break;
			}
		h++;
		}

		int i=100;
		do {
			System.out.println(i);
			i++;
		}while (i<10);

		for (int j=0; j<100; j++) {
			if (j%2==0) {
				System.out.println(j);
			}
		}
		for (int j=0; j<100;j++) {
			if (j%2!=0) {
				continue;
			}
			System.out.println(j);
		}

		int j=0;
		for(;j<100;) {
			if(j%2!=0) {
				continue;
			}
			System.out.println(j);
			j++;
		}

		int k=56;
		if ( k>=90) {
			System.out.println("A");
		} else if (k>=80&&k<90) {
			System.out.println("B");
		} else if (k>=70&&k<80) {
			System.out.println("C");
		} else if (k>=60&&k<70) {
			System.out.println("D");
		}else {System.out.println("E");
		}











	}
}
