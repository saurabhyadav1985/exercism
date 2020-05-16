class LuhnValidator {

	boolean isValid(String candidate) {
		if ("0".equals(candidate.trim())) {
			return false;
		}

		int sum = 0;
		boolean isEven = true;
		for (int index = candidate.length() - 1; index >= 0; index = index - 1) {

			char ch = candidate.charAt(index);
			if (ch != 32) {
				if (!Character.isDigit(ch)) {
					return false;
				}

				isEven = !isEven;
				int value = ch - 48;
				if (isEven) {
					value = value * 2;
					if (value > 9) {
						value = value - 9;
					}
				}
				sum += value;
			}
		}
		return sum % 10 == 0;
	}

}
