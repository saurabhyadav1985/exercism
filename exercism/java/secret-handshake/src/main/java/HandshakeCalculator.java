import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

	List<Signal> calculateHandshake(int number) {
		String binary = Integer.toBinaryString(number);
		int lengthBinary = binary.length();
		List<Signal> signals = new ArrayList<>();
		for (int index = lengthBinary - 1; index >= 0; index--) {
			if (binary.charAt(index) == '1') {
				int value = 1 * (int) Math.pow(10, lengthBinary - 1 - index);
				switch (value) {
				case 1:
					signals.add(Signal.WINK);
					break;
				case 10:
					signals.add(Signal.DOUBLE_BLINK);
					break;
				case 100:
					signals.add(Signal.CLOSE_YOUR_EYES);
					break;
				case 1000:
					signals.add(Signal.JUMP);
					break;
				case 10000:
					Collections.reverse(signals);
					break;
				}
			}
		}
		return signals;
	}
}
