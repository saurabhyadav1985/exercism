class ReverseString {

    String reverse(String inputString) {
    	char[] inputCharArray = inputString.toCharArray();
    	StringBuilder reversed = new StringBuilder();
    	for ( int index = inputCharArray.length-1; index >= 0; index--) {
    		reversed.append(inputCharArray[index]);
    	}
    	return reversed.toString();
    }
  
}
