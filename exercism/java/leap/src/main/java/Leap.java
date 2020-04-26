class Leap {

	boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				}
			} else {
				isLeap = true;
			}
		}

		return isLeap;
	}

}
