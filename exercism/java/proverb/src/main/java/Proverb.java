class Proverb {

	String[] words;

	Proverb(String[] words) {
		this.words = words;
	}

	String recite() {
		if (words.length == 0) {
			return "";
		}
		StringBuilder reciteStrBuilder = new StringBuilder();
		for (int index = 0; index < words.length - 1; index++) {
			reciteStrBuilder.append("For want of a " + words[index] + " the " + words[index + 1] + " was lost.\n");
		}
		reciteStrBuilder.append("And all for the want of a " + words[0] + ".");
		return reciteStrBuilder.toString();
	}

}
