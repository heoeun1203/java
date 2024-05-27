package basic.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		String path = "src/gui/builder/app/MyEditor.java";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String c = null;
		while((c = br.readLine()) != null) {
			System.out.println(c);
		}
		br.close();
		
	}

}