package FileHandling;
import java.io.*;
//to write data to file using FileOutputStream class
public class file1 {

	public static void main(String[] args){
		
		try {
			FileOutputStream fout=new FileOutputStream("H:\\profound.txt",true);//hre true indicates append mode inside
			String s="Welcome the my world";
//			byte b[]=s.getBytes();
			fout.write(s.getBytes());
			fout.close();
			System.out.println("Success...");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) throws FileNotFoundException {
//		
//		FileOutputStream fout=new FileOutputStream("f://profound.txt");
//		
//	}

}
