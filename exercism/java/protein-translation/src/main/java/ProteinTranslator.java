import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

	List<String> translate(String rnaSequence) {
		String[] sequences = new String[rnaSequence.length()/3];
		for(int i =0; i < rnaSequence.length()/3; i++) {
			sequences[i] = rnaSequence.substring(i*3, i*3+3);
		}
		
		List<String> translation = new ArrayList<>();
		for (String seq : sequences) {
			String protein = Codon.valueOf(seq).getProtein();
			if (protein.equals("STOP")) {
				break;
			}
			translation.add(protein);
		}
		return translation;
	}

	private enum Codon {
		AUG("Methionine"), UUU("Phenylalanine"), UUC("Phenylalanine"), UUA("Leucine"), UUG("Leucine"), UCU("Serine"),
		UCC("Serine"), UCA("Serine"), UCG("Serine"), UAU("Tyrosine"), UAC("Tyrosine"), UGU("Cysteine"), UGC("Cysteine"),
		UGG("Tryptophan"), UAA("STOP"), UAG("STOP"), UGA("STOP");

		String protein;

		Codon(String protein) {
			this.protein = protein;
		}

		public String getProtein() {
			return protein;
		}

	}
}
