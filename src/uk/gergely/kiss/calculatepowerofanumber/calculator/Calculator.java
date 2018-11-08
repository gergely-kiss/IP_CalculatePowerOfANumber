package uk.gergely.kiss.calculatepowerofanumber.calculator;

public class Calculator {
	protected double isDefault(double number, int power) throws Exception {
		if (power == 0 && number == 0) {
			throw new Exception("Undefined");
		}
		if (number == 0) {
			return 0;
		}
		if (power == 0) {
			return 1;
		}
		if (power == 1)
			return number;
		return -1;
	}
}
