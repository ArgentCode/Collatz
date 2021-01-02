package basis;

public class Formula {


	public static void main(String[] args) {
		System.out.println("Start: steps:");
		CollatzMachine calc = new CollatzMachine();
		for (long i = 1; i < 1000000; i++) {
			calc.calculate(i);
		} //end for
		calc.print();
		calc.printMax();
	}

}
