public class PalinRec{
/*	public static boolean isPalindrome(String word, int ini, int fim){
		boolean resp = true;
		ini = 0;
		fim = word.length()-1;
		if(ini <= fim){
			if(word.charAt(ini) != word.charAt(fim)){
			      resp = false;
			}
			resp = isPalindrome(word, ini+1, fim-1);
		}
		return resp;
	}*/

	/*
	public static boolean isPalindrome(String word, int ini, int fim) {
    		boolean resp = true;
		ini = 0;
                fim = word.length()-1;
		if (ini < word.length()/2) {
       
   		  if (word.charAt(ini) != word.charAt(fim)) {
     		      return false;
        	}else{
		isPalindrome(word, ini + 1, fim - 1);		
	    	}

		}
		return resp;
	}
	*/
/*
	public static boolean isPalindrome(String word, int ini, int fim) {
    if (ini >= fim) {
        return true;
    }

    if (word.charAt(ini) != word.charAt(fim)) {
        return false;
    }

    return isPalindrome(word, ini + 1, fim - 1);
}

*/

public static boolean isPalindrome(String word, int ini, int fim) {
    if (ini >= fim) {
        return true;
    }

    if (word.charAt(ini) != word.charAt(fim)) {
        return false;
    }

    return isPalindrome(word, ini + 1, fim - 1);
}

public static boolean isPalindrome(String word) {
    return isPalindrome(word, 0, word.length() - 1);
}
		

	public static void main(String args[]){
	       String word;
	       MyIO.setCharset("UTF-8");
	       do{
		       word = MyIO.readLine();

                       if(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M'){
                       if(isPalindrome(word, 0, 0)){
			       MyIO.println("SIM");
		       }
		       else{
			       MyIO.println("NAO");
		       }
		       }

	       }while(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M');
       }
}
