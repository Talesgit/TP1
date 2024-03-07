import java.lang.String;

public class palindromoJ{

	static boolean strcmp(String word1, String word2){
		boolean resp = true;
		if(word1.length() != word2.length()){
			resp = false;
		}
		else{
			for(int i = 0 ; i < word1.length(); i++){
				if(word1.charAt(i) != word2.charAt(i)){
					resp = false;
	      				i = word1.length();
				}
			}
		}
		return resp;
	}

	static boolean isPalindrome(String word){

		boolean resp = true;
		for(int i = 0, k = word.length() - 1; i < word.length()/2; i++, k--){
			System.out.println(word.charAt(i));
			System.out.println(word.charAt(k));
			if(word.charAt(i) != word.charAt(k)){
				resp = false;
			}
		}
		return resp;
	}

       public static void main(String[] args){
	       String word;
	       MyIO.setCharset("UTF-8");
	       do{
		       word = MyIO.readLine();

                       if((strcmp(word, "FIM") == false)){
                       if(isPalindrome(word)){
			       MyIO.println("SIM");
		       }
		       else{
			       MyIO.println("NAO");
		       }
		       }
		    	
	       }while((strcmp(word, "FIM")) == false);
       }
}
