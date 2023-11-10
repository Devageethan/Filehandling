package fileHandle1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String[] args) {
	File f=new File("Example1.txt");
	try {
		FileWriter fw=new FileWriter(f);
		fw.write("hello i am new file Example1");
		fw.append("\n i am deva");
		fw.close();
		System.out.println("file has been Written");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
