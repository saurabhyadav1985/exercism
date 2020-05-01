class RaindropConverter {
	private final String THREE_FACTOR_OUTPUT = "Pling";
	private final String FIVE_FACTOR_OUTPUT = "Plang";
	private final String SEVEN_FACTOR_OUTPUT = "Plong";

	String convert(int number) {

		StringBuilder output = new StringBuilder();

		if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
			return String.valueOf(number);
		else {

			if (number % 3 == 0) {
				output.append(THREE_FACTOR_OUTPUT);
			}
			if (number % 5 == 0) {
				output.append(FIVE_FACTOR_OUTPUT);
			}
			if (number % 7 == 0) {
				output.append(SEVEN_FACTOR_OUTPUT);
			}
		}
		
		return output.toString();
	}

}
