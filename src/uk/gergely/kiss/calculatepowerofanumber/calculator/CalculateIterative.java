package uk.gergely.kiss.calculatepowerofanumber.calculator;

import uk.gergely.kiss.educationutil.print.method.biprintable.withexception.BiPrintableWithException;

public class CalculateIterative extends Calculator implements BiPrintableWithException<Double, Integer, Double>{
	
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

	@Override
	public Double execute(Double number, Integer power) throws Exception {
		return powerCalculateIterative(number, power);
	}
}
