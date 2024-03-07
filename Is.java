import java.lang.String;
import java.lang.Double;

public class Is{

        public static boolean isVogal(String word){
		boolean resp = true;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u' && word.charAt(i) != 'A' && word.charAt(i) != 'E' && word.charAt(i) != 'I' && word.charAt(i) != 'O' && word.charAt(i) != 'U'){
				resp = false;
			}
		}
		return resp;
	}

	public static boolean isConsonant(String word){
		boolean resp = true;
		for(int i = 0; i < word.length(); i++){
			if((word.charAt(i) > '0' && word.charAt(i) < '9') || word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U'){
                                resp = false;
				i = word.length();
                        }
		}
		return resp;
	}

	public static boolean isInt(String word){
		boolean resp = true;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) < '0' || word.charAt(i) > '9'){
				resp = false;
			}
		}
		return resp;
	}

	public static boolean isChar(String c){
		boolean resp = false;

		for(int i = 0; i < c.length(); i++){

                         if ('0' <= c.charAt(i) && c.charAt(i) <= '9') {
                         resp = false;
                        } else if (('a' <= c.charAt(i) && c.charAt(i) <= 'z') || ('A' <= c.charAt(i) && c.charAt(i) <= 'Z') || ((int)c.charAt(i) == -61) || ((int)c.charAt(i) == -17) || (int)c.charAt(i) >= 225 || (int)c.charAt(i) <= 256) {
                          resp = true;
                         } else {
                          resp = false;
	      		 }
			 if(c.charAt(i) == '.' || c.charAt(i) == ','){
				 resp = true;
			 }
		}
		         return resp;
	}

	public static boolean isReal(String word){
		boolean resp = false;
		int count = 0;
		
			   if(!(isChar(word))){
			      for(int i = 0; i < word.length(); i++){
				 //     MyIO.println(word.charAt(i));
					      if(word.charAt(i) == ',' || word.charAt(i) == '.'){
					      count++;
				      }
			      }

			if(count <= 1){
				resp = true;
			}
	         }
		return resp;
	
	}

	public static void main(String args[]){
		String word;
		do{
			word = MyIO.readLine();
			if(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M'){
				if(isVogal(word)){
					MyIO.print("SIM");
				}else{
					MyIO.print("NAO");
				}
				if(isConsonant(word)){
					MyIO.print(" SIM");
				}else{
					MyIO.print(" NAO");
				}
				if(isInt(word)){
					MyIO.print(" SIM");
				}else{
					MyIO.print(" NAO");
				}
				if(isReal(word)){
					MyIO.println(" SIM");
				}else{
					MyIO.println(" NAO");
				}
			}
		}while(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M');
	}

}
