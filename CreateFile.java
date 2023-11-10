package fileHandle1;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f=new File("Example1.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file created"+f.getName());
			}
			else {
				System.out.println("file not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
	}
}
