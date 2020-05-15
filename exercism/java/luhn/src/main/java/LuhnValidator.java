class LuhnValidator {

	boolean isValid(String candidate) {
		candidate = candidate.replaceAll(" ", "");
		int sum = 0;
		for (int index = candidate.length() - 1; index >= 0; index = index - 1) {

			int value = candidate.charAt(index) - 48;
			if (value < 0 && value > 9) {
				return false;
			}
			if (index % 2 == 0) {
				value = value * 2;
				if (value > 9) {
					value = value - 9;
				}
			}
			sum += value;
		}
		return sum % 10 == 0;
	}

}
