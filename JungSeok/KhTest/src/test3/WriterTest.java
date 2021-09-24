package test3;

import java.io.FileNotFoundException;
import java.io.FileWriter;

public class WriterTest {
	
	FileWriter fw = null;
	try {
		fw = enw FileWriter("test.txt");
		fw.write(97);
		fw.write(65);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}

}
