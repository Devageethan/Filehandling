package fileHandle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
public static void main(String[] args) {
	File f=new File("Example1.txt");
	try {
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
	System.out.println("file readed");
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getName());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
