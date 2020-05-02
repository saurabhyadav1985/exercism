import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

	int computeSquareOfSumTo(int input) {
		int sum = IntStream.rangeClosed(1, input).sum();
		return sum * sum;
	}

	int computeSumOfSquaresTo(int input) {
		return IntStream.rangeClosed(1, input).map(index -> index*index).sum();
	}

	int computeDifferenceOfSquares(int input) {
		return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
	}
}
