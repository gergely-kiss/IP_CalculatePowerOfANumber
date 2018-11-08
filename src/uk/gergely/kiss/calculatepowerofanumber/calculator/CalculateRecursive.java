package uk.gergely.kiss.calculatepowerofanumber.calculator;

import uk.gergely.kiss.educationutil.print.method.biprintable.withexception.BiPrintableWithException;

public class CalculateRecursive extends Calculator implements BiPrintableWithException<Double, Integer, Double>{

	private double powerCalculateRecursive(double number, int power) throws Exception {

		if (isDefault(number, power) != -1)
			return isDefault(number, power);
		boolean isNegativePower = power < 0;
		power = isNegativePower ? -power : power;
		double result = recursivePowerCalculate(number, power);
		return isNegativePower ? 1/result : result;

	}

	private double recursivePowerCalculate(double number, int power) {
		return power == 1? number :number * recursivePowerCalculate(number, power - 1);
	}

	@Override
	public Double execute(Double number, Integer power) throws Exception {
		return powerCalculateRecursive(number, power);
	}

}
