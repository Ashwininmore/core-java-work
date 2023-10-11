package FileHandling;

import java.io.*;

//to read data from file using FileInputStream class
public class file2 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("H:\\profound.txt");
			int i;
			while((i=fin.read())!=-1) { //-1 indicate EOF
				System.out.print((char)i);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
