import java.math.BigInteger;

class Grains {

	BigInteger grainsOnSquare(final int square) {
		if (square < 1 || square > 64)
			throw new IllegalArgumentException("square must be between 1 and 64");

		return BigInteger.valueOf((long) Math.pow(2, square - 1));
	}

	BigInteger grainsOnBoard() {
		BigInteger sum = BigInteger.valueOf(0);
		for (int index = 1; index <= 64; index++) {
			sum.add(grainsOnSquare(index));
		}
		return sum;
	}
}
