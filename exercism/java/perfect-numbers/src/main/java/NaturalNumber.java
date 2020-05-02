import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class NaturalNumber {

	int number;

	public NaturalNumber(int number) {
		super();
		this.number = number;
	}

	public Classification getClassification() {
		int sum = compute(number);
		
		if(sum > number) {
			return Classification.ABUNDANT;
		}
		else if(sum < number) {
			return Classification.DEFICIENT;
		}
		else {
			return Classification.PERFECT;
		}
		
	}

	private int compute(int num) {
		Optional<Integer> sum = computePrimeFactors(num).stream().reduce((a,b)-> a+b);
		return sum.isPresent() ? sum.get() : 0;
	}

	private List<Integer> computePrimeFactors(int num) {
		
		List<Integer> factors = new ArrayList<>();
		factors.add(1);
		
		for(int index =2; index <= num/2; index++) {
			if(num%index==0) {
				factors.add(index);
			}
		}
		return factors;
	}
}
