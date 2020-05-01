import static java.util.Objects.*;

class Scrabble {
	String word;
	int score = 0;
	
	Scrabble(String word) {
		requireNonNull(word);
		this.word = word.toUpperCase();
	}

	int getScore() {
		calculateScore();
		return score;
	}
	
	void calculateScore() {
		char[] characters = word.toCharArray();
		for(char ch : characters) {
			score += Score.valueOf(String.valueOf(ch)).getValue();
		}
	}

	private enum Score{
    	A(1), E(1), I(1), O(1),U(1), L(1), N(1), R(1), S(1), T(1),
    	D(2), G(2),
    	B(3), C(3),M(3), P(3),
    	F(4),H(4),V(4),W(4),Y(4),
    	K(5),
    	J(8),X(8),
    	Q(10),Z(10);

    	int value;
    	
    	Score(int value){
    		this.value = value;
    	}

		public int getValue() {
			return value;
		}
    }

}
