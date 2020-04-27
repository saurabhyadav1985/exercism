import java.util.Arrays;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int count = 0;
		int temp = numberToCheck;

		while (temp != 0) {
			temp /= 10;
			count++;
		}

		int[] digits = new int[count];
		temp = numberToCheck;
		for (int index = count - 1; index >= 0; index--) {
			digits[index] = temp % 10;
			temp /= 10;
		}

		int result = Arrays.stream(digits).map(num -> (int) Math.pow(num, digits.length)).sum();
		return numberToCheck == result;

	}

}
