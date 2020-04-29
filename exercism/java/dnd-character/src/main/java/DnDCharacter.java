import java.util.Random;

class DnDCharacter {

	Random random = new Random();
	int modifier;
	
	int ability() {
		return 6;
	}

	int modifier(int input) {
		modifier =(int) Math.floor((input - 10)/2.0);
		return modifier;
	}

	int getStrength() {
		return calculateRandomAbility();
	}

	int getDexterity() {
		return calculateRandomAbility();
	}

	int getConstitution() {
		return calculateRandomAbility();
	}

	int getIntelligence() {
		return calculateRandomAbility();
	}

	int getWisdom() {
		return calculateRandomAbility();
	}

	int getCharisma() {
		return calculateRandomAbility();
	}

	int getHitpoints() {
		return 10 - modifier;
	}

	int calculateRandomAbility() {
		int[] arr = new int[4];
		int min = 0;
		for (int i = 0; i < 4; i++) {
			int temp = random.nextInt(6);
			if (temp < min)
				min = temp;
			arr[i] = temp;
		}

		int sum = 0;
		boolean flag = true;
		for (int element : arr) {
			if (element < min && flag) {
				continue;
			}
			sum = sum + element;
			flag = false;
		}
		return sum;
	}

}
