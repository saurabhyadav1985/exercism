import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

	public boolean isPangram(String input) {

		if ("".equals(input)) {
			return false;
		}

		input = input.toUpperCase();
		Set<Character> charSet = new HashSet<>();
		long count = input.chars().mapToObj(ch -> (char) ch).filter(Character::isLetter).filter(charSet::add).count();

		return count == 26;
	}

}
