package basis;

import java.util.ArrayList;

public class CollatzMachine {
	
	public ArrayList<Long> record;
	
	public CollatzMachine() {
		record = new ArrayList<Long>();
		record.add((long) 0);
	}
	
	public long calculate(long n) {
		long count = 0;
		while (n != 1) {
			if(n < record.size()) {
				count += record.get((int) n);
				record.add(count);
				return count;
			} else if (n%2==0) {
				n=n/2;
				count++;
			} else {
				n= (3*n)+1;
				count++;
			}
			
		}

		record.add(count);
		return count;
	}
	
	public void print() {
		for (int i =1; i < record.size(); i++) {
			System.out.println(i + " " + record.get(i));
		}
	}
	
	public void printMax() {
		Long x = (long) 0;
		int j = 0;
		for (int i =1; i < record.size(); i++) {
			if (x < record.get(i)) {
				x = record.get(i);
				j = i;
			}
		}
		
		System.out.println(j + " " + x);
	}

}
