package uk.gergely.kiss.calculatepowerofanumber;

public class CalculatePowerOfANumber {

	public static void main(String[] args) {

		printResult(2, 3);
		printResult(0, 0);
		printResult(0, -2);
		printResult(-2, 0);
		printResult(123, 2);
		printResult(2, -2);
		printResult(2.5, 2);
	}

	public static double isDefault(double number, int power) throws Exception {
		if (power == 0 && number == 0) {
			throw new Exception("Undefined");
		}
		if (number == 0) {
			return 0;
		}
		if (power == 0) {
			return 1;
		}
		return -1;
	}
//TODO isNegative grab the negative sing run the rec or it solution then  1/n or do nutting accordingly
	public static double powerCalculate(double number, int power) throws Exception {
		if (isDefault(number, power) != -1)
			return isDefault(number, power);

		double result = number;
		boolean isNegativePower = power < 0;
		power = isNegativePower ? -power : power;
		for (int i = 1; i < power; i++) {
			result *= number;
		}
		return isNegativePower ? 1 / result : result;
	}

	public static double powerCalculateRecursive(double number, int power) throws Exception {
		if (isDefault(number, power) != -1)
			return isDefault(number, power);
		if (power > 0) {
			return number * powerCalculateRecursive(number, power - 1);
		} else {
			return 1 / (powerCalculateRecursive(number, -power));
		}
	}

	public static void printResult(double number, int power) {
		try {
			System.out.println("powerCalculate: The " + number + " on the power of " + power + ": "
					+ powerCalculate(number, power));
		} catch (Exception e) {
			System.err.println("powerCalculate: The " + number + " on the power of " + power + ": " + e.getMessage());
		}
		try {
			System.out.println("powerCalculateRecursive: The " + number + " on the power of " + power + ": "
					+ powerCalculateRecursive(number, power));
		} catch (Exception e) {
			System.err.println(
					"powerCalculateRecursive: The " + number + " on the power of " + power + ": " + e.getMessage());
		}
	}
}
