package FileHandle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writefile {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try {
		System.out.println("enter your file name");
		
		String s1=s.nextLine();
		System.out.println("enter your content");
		String s2=s.nextLine();
		FileWriter fw=new FileWriter("D:\\"+s1+".txt");
		fw.write(s2);
		fw.flush();
		fw.close();
		System.out.println("succesfully file written");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("exception occur");
	}
	
}
}
