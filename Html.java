import java.io.*;
import java.net.*;

class Html{
	public static String ler(String nome, String end){
	     URL url;
             InputStream is = null;
             BufferedReader br;
             String resp = "", line;

      try {
         url = new URL(end);
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));

         while ((line = br.readLine()) != null) {
            resp += line + "\n";
         }

      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 

      try {
         is.close();
      } catch (IOException ioe) {
         // nothing to see here

      }
      return resp;
	}

	public static boolean isConsonant(char a){
		boolean resp = false;
		String cons = "bcdfghjklmnpqrstvwxyz";
		for(int i = 0; i < cons.length(); i++){
			if(a == cons.charAt(i)){
				resp = true;
			}
		}
		return resp;
	}
        
       public static void test(String nome, String end){
       		String html = ler(nome, end);
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0, x10 = 0, x11 = 0, x12 = 0, x13 = 0, x14 = 0, x15 = 0, x16 = 0, x17 = 0, x18 = 0, x19 = 0, x20 = 0, x21 = 0, x22 = 0, x23 = 0, x24 = 0, x25 = 0, x26 = 0;
		for(int i = 0; i < html.length(); i++){
			if(isConsonant(html.charAt(i))){
				x23++;
			}
		switch(html.charAt(i)){
			case 'a':
			x1++;
			break;
			case 'e':
	    		x2++;
			break;
			case 'i':
			x3++;
			break;
			case 'o':
			x4++;
			break;
			case 'u':
			x5++;
			break;
			case 225:
			x6++;
			break;
			case 233:
			x7++;
			break;
			case 237:
			x8++;
			break;
			case 243:
			x9++;
			break;
			case 250:
			x10++;
			break;
			case 224:
			x11++;
			break;
			case 232:
			x12++;
			break;
			case 236:
			x13++;
			break;
			case 242:
			x14++;
			break;
			case 249:
			x15++;
			break;
			case 227:
			x16++;
			break;
			case 245:
			x17++;
			break;
			case 226:
			x18++;
			break;
			case 234:
			x19++;
			break;
			case 238:
			x20++;
			break;
			case 244:
			x21++;
			break;
			case 251:
			x22++;
			break;
			case 60:
			     if(html.charAt(i+1) == 'b' && html.charAt(i+2) == 'r' && html.charAt(i) == 62){
				     x24++;
			     }else if(html.charAt(i+1)=='t' && html.charAt(i+2)=='a' && html.charAt(i+3)=='b' && html.charAt(i+4)=='l' && html.charAt(i+5)=='e' && html.charAt(i+6)==62){
				     x25++;
				     x1 -= 1;
				     x2 -= 1;
				     x23 -= 3;
			     }
			     break;
		}
		}
		System.out.printf("a(%d) ", x1);
			System.out.printf("e(%d) ", x2);
			System.out.printf("i(%d) ", x3);
			System.out.printf("o(%d) ", x4);
			System.out.printf("u(%d) ", x5);
			System.out.printf("%c(%d) ", 225, x6);
			System.out.printf("%c(%d) ", 233, x7);
			System.out.printf("%c(%d) ", 237, x8);
			System.out.printf("%c(%d) ", 243, x9);
			System.out.printf("%c(%d) ", 250, x10);
			System.out.printf("%c(%d) ", 224, x11);
			System.out.printf("%c(%d) ", 232, x12);
			System.out.printf("%c(%d) ", 236, x13);
			System.out.printf("%c(%d) ", 242, x14);
			System.out.printf("%c(%d) ", 249, x15);
			System.out.printf("%c(%d) ", 227, x16);
			System.out.printf("%c(%d) ", 245, x17);
			System.out.printf("%c(%d) ", 226, x18);
			System.out.printf("%c(%d) ", 234, x19);
			System.out.printf("%c(%d) ", 238, x20);
			System.out.printf("%c(%d) ", 244, x21);
			System.out.printf("%c(%d) ", 251, x22);
            MyIO.print(
                        "consoante("+ x23 +") "+
                        "<br>("+ x24 +") "+
                        "<table>("+ x25 +") "+
                        nome +
                        "\n"
                      );
       }	       

	public static void main(String args[]){
		String word;
		String url;
		MyIO.setCharset("UTF-8");
		do{
			word = MyIO.readLine();
			if(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M'){
				 url = MyIO.readLine();
				//MyIO.println(ler(word, url));
					test(word, url);
			}
		}while(word.length() != 3 || word.charAt(0) != 'F' || word.charAt(1) != 'I' || word.charAt(2) != 'M');
	}
}
