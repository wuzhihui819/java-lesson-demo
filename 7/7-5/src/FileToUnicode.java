import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

public class FileToUnicode {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/FileToUnicode.java");
			InputStreamReader dis = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(dis);
			String s;
			while((s = reader.readLine()) != null) {
				System.out.println("read: " + s);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
