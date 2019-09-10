import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream out;
		try {
			out = new FileOutputStream("myFile.dat");
			out.write('H');
			out.write(69);
			out.write(76);
			out.write('L');
			out.write('O');
			out.write('!');
			out.close();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error: Cannot open file for writing.");
		} catch (IOException e) {
			System.out.println("Error: Cannot write to file.");
		}
	}
}
