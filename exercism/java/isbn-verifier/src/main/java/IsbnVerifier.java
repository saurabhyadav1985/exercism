class IsbnVerifier {

	boolean isValid(String stringToVerify) {
		if ("".equals(stringToVerify)) {
			return false;
		}
		int multiplier = 10;
		int isbn = 0;
		int count = 0;
		for (char ch : stringToVerify.toCharArray()) {
			if (ch != '-') {
				count++;
				if (ch == 'X') {
					if( count != 10) {
						return false;
					}
					isbn = isbn + 10 * multiplier--;
				} else {
					isbn = isbn + (Integer.valueOf(ch)-48) * multiplier--;
				}
			}
		}
		if (isbn % 11 == 0 && count ==10) {
			return true;
		} else {
			return false;
		}
	}

}
