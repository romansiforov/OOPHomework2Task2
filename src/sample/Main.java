package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TextTransformer tt = new TextTransformer();
		InverseTransformer it = new InverseTransformer();
		UpDownTransformer udt = new UpDownTransformer();
		
		TextSaver ts = new TextSaver(tt, file);
		
		ts.saveTextToFile("roman siforov");
		
//		ts.setTransformer(it);
//		
//		ts.saveTextToFile("roman siforov");
//		
//		ts.setTransformer(udt);
//		
//		ts.saveTextToFile("roman siforov");

	}

}
