public class Hamming {

	private String leftStrand;
	private String rightStrand;

	public Hamming(String leftStrand, String rightStrand) {
		if (leftStrand.length() != rightStrand.length()) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	public int getHammingDistance() {
		int distance = 0;
		for (int index = 0; index < leftStrand.length(); index++) {
			if (leftStrand.charAt(index) != rightStrand.charAt(index))
				distance++;
		}
		return distance;
	}
}
