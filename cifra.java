import java.lang.String;

public class cifra{
	public static String cesar(String word){
		String ces = "";

		for(int i = 0; i < word.length(); i++){
			ces += (char)((int) word.charAt(i) + 3);
		}
		return ces;
	}

	public static boolean mCmp(String one, String two){
		boolean resp = true;
		if(one.length() != two.length()){
			return false;
		}else{
			for(int i = 0; i < one.length(); i++){
				if(one.charAt(i) != two.charAt(i)){
					resp = false;
					i = one.length();
				}
			}
	}
	return resp;
	}

        public static void main(String argsr[]){
		String word; 
		do{
		word = MyIO.readLine();
		if(mCmp(word, "FIM") == false){
		MyIO.println(cesar(word));
		}
		}while(mCmp(word, "FIM") == false);
	}
}
