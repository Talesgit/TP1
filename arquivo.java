import java.io.RandomAccessFile;
import java.io.BufferedReader;
import java.io.IOException;

class arquivo{
	public static void arq(int n){
                int count = 0;
		try{
		RandomAccessFile rf = new RandomAccessFile("nums.txt", "rw");

		while(count < n){
			float ler = MyIO.readFloat();
			rf.writeFloat(ler); 
			count++;
		}

		count = 0;
		//rf.seek(n);
		while(n > count){
			rf.seek((long)(n-1)*4 );
			float valor = (float) rf.readFloat();
			if((valor*10)%10==0 && (valor*100)%10==0 ){
               	       	    MyIO.println((int)valor);
               		}else{
                            MyIO.println(valor);
                	}
			n--;
		}

		rf.close();
		}catch(IOException e){
			MyIO.println("Um erro ocorreu");
			e.printStackTrace();
		}
	}

	public static void main(String args[]){
		int n = 0;
		n = MyIO.readInt();
		arq(n);
	}
}
