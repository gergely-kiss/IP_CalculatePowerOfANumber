package uk.gergely.kiss.calculatepowerofanumber;

import uk.gergely.kiss.calculatepowerofanumber.calculator.CalculateIterative;
import uk.gergely.kiss.calculatepowerofanumber.calculator.CalculateRecursive;
import uk.gergely.kiss.educationutil.print.method.PrintMethod;

public class CalculatePowerOfANumber {

	public static void main(String[] args) {

		CalculateIterative ci = new CalculateIterative();
		CalculateRecursive cr = new CalculateRecursive();
		PrintMethod pm = new PrintMethod();

		try {
			pm.printMehod(2.0, 3, ci);
			pm.printMehod(0.0, 0, ci);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			pm.printMehod(2.0, 3, cr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
