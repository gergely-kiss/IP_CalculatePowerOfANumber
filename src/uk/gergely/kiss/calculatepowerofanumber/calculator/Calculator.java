package uk.gergely.kiss.calculatepowerofanumber.calculator;

import uk.gergely.kiss.educationutil.print.method.PrintMethod;
import uk.gergely.kiss.educationutil.print.method.biprintable.withexception.BiPrintableWithException;

public class Calculator implements BiPrintableWithException<Double, Integer, Double> {
	private double isDefault(double number, int power) throws Exception {
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

	private double powerCalculateIterative(double number, int power) throws Exception {
		if (isDefault(number, power) != -1)
			return isDefault(number, power);
		boolean isNegativePower = power < 0;
		power = isNegativePower ? -power : power;
		double result = iterativePowerCalculator(number, power);
		return isNegativePower ? 1 / result : result;
	}

	private double iterativePowerCalculator(double number, int power) {
		double result = number;
		for (int i = 1; i < power; i++) {
			result *= number;
		}
		return result;
	}

	private double powerCalculateRecursive(double number, int power) throws Exception {

		if (isDefault(number, power) != -1)
			return isDefault(number, power);
		boolean isNegativePower = power < 0;
		power = isNegativePower ? -power : power;
		double result = recursivePowerCalculate(number, power);
		return isNegativePower ? -result : result;

	}

	private double recursivePowerCalculate(double number, int power) {
		return number * recursivePowerCalculate(number, power - 1);
	}

	public void printResult(double number, int power) {
		try {
			PrintMethod pm = new PrintMethod("Number: ", " Power: ", "Result: ");
			
			pm.printMehod(number, power, this);
		} catch (Exception e) {
			System.err.println("powerCalculate: The " + number + " on the power of " + power + ": " + e.getMessage());
		}

	}

	@Override
	public Double execute(Double number, Integer power) throws Exception {
		return powerCalculateIterative(number, power);
	}
}
