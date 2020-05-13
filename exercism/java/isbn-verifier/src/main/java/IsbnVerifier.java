class IsbnVerifier {

	boolean isValid(String stringToVerify) {
		if ("".equals(stringToVerify)) {
			return false;
		}
		int multiplier = 10;
		int isbn = 0;
		for (char ch : stringToVerify.toCharArray()) {
			if (ch != '-') {
				isbn = isbn + Integer.valueOf(ch) * multiplier--;
			}
		}
		if (isbn % 11 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
