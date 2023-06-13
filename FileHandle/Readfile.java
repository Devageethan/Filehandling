package FileHandle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("D:\\deva.txt");
		int data=fr.read();
		String s="";
		while(data!=-1) {
			char ch=(char)data;
			s=s+ch;
			data=fr.read();
		}
		System.out.println(s);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
