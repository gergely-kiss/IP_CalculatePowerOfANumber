package uk.gergely.kiss.calculatepowerofanumber;

import uk.gergely.kiss.calculatepowerofanumber.calculator.Calculator;

public class CalculatePowerOfANumber {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.printResult(2, 3);
		calculator.printResult(0, 0);
		calculator.printResult(155, 1);
		calculator.printResult(0, -2);
		calculator.printResult(-2, 0);
		calculator.printResult(123, 2);
		calculator.printResult(2, -2);
		calculator.printResult(2.5, 2);
	}
}
