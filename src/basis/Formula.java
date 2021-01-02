package basis;

public class Formula {
	
	public static int formula(long n) {
		int count = 0;
		
		while (n != 1) {
			if (n%2==0) {
				n=n/2;
				count++;
			} else {
				n= (3*n)+1;
				count++;
			}
		} //end while
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Start: steps:");
		int n=0;
		int j=1;
		for (int i = 1; i < 1000000; i++) {
			int x =  formula(i);
			System.out.println(i + "      " + x);
			if (x > n) {
				n = x;
				j=i;
			} //else nothing
		} //end for
		System.out.println(j + " " + n);
	}

}
