import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

	private String phrase;
	private String shortForm;

	Acronym(String phrase) {
		if (phrase.isEmpty()) {
			throw new IllegalArgumentException("Phrase can not be empty");
		}
		this.phrase = phrase;
	}

	String get() {
		generateShortForm();
		return shortForm;
	}

	void generateShortForm() {
		String[] parts = phrase.split("[ ,._-]");
		
		shortForm = Arrays.stream(parts)
							.filter(str -> !str.isEmpty())
							.map(part -> String.valueOf(part.charAt(0)))
							.collect(Collectors.joining());
		
		shortForm = shortForm.toUpperCase();
	}

}
