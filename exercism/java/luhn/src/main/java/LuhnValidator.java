class LuhnValidator {

	boolean isValid(String candidate) {
		candidate = candidate.replaceAll(" ", "");
		if("0".equals(candidate.trim())) {
			return false;
		}
		int sum = 0;
		boolean isEven = true;
		for (int index = candidate.length() - 1; index >= 0; index = index - 1) {
			isEven = !isEven;
			if(!Character.isDigit(candidate.charAt(index))){
				return false;
			}
			int value = candidate.charAt(index) - 48;
			if (value < 0 && value > 9) {
				return false;
			}
			if (isEven) {
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
