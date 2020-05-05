import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

	List<Signal> calculateHandshake(int number) {
		String binary = Integer.toBinaryString(number);

		int index = 1;
		while (index < binary.length()) {
			int firstPosition = 0;
			while (binary.charAt(index) == '0') {
				index++;
			}

			String str = binary.substring(firstPosition, index);
			System.out.println(str);
			firstPosition =index;
		}
		return Collections.EMPTY_LIST;
	}

}
