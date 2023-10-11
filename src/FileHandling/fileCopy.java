package FileHandling;
import java.io.*;

public class fileCopy {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fin=new FileInputStream("H:\\profound.txt");
		FileOutputStream fout=new FileOutputStream("H:\\abc.txt");
		int i;
		while((i=fin.read())!=-1) { //-1 indicate EOF
			fout.write((char)i); //copy data from one to another
			System.out.print((char)i);
		}
		System.out.println("\nSuccess");
		fout.close();
		fin.close();
	}

}
