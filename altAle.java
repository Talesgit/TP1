import java.util.Random;

public class altAle{
	public static String alt(String word, char a, char b){
		String word2 = "";
		for(int i = 0 ; i < word.length(); i++){
			if(word.charAt(i) != a){
			word2 += word.charAt(i);
			}else{
				word2 += b;
			}
		}
		return word2;
	}

	public static void main(String args[]){
		Random ger = new Random();
		String word;
		ger.setSeed(4);
		do{
			char a = (char)('a' + (Math.abs(ger.nextInt()) % 26));
                       	char b = (char)('a' + (Math.abs(ger.nextInt()) % 26));
			word = MyIO.readLine();
			if(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M'){
				word = alt(word, a , b);
				MyIO.println(word);
			}
		
		}while(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M');
	}

}
