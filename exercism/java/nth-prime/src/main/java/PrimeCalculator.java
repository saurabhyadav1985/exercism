class PrimeCalculator {

	int nth(int nth) {
		if (nth < 2) {
			throw new IllegalArgumentException("Invalid input");
		}

		int position = 0;
		int number = 2;
		while (position <= nth) {
			if (isPrime(number)) {
				System.out.println(number);
				position++;
				if (position == nth)
					break;
			}
			number++;
		}
		return number;
	}

	boolean isPrime(int number) {
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				return false;
			}
		}
		return true;
	}

}
