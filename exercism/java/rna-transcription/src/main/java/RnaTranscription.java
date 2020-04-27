class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] dnaChars = dnaStrand.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : dnaChars) {
        	sb.append(transform(ch));
        }
        
        return sb.toString();
    }
    
    private char transform(char ch){
    	char out = 0;
    	switch(ch) {
    	case 'G':
    		out = 'C';
    		break;
    	case 'C':
    		out = 'G';
    		break;
    	case 'T':
    		out = 'A';
    		break;
    	case 'A':
    		out = 'U';
    		break;
    	default:
    		break;
    	}
    	
    	return out;
    }

}
