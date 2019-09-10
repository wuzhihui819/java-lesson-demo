import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("myFile.dat");
			while(in.available() > 0) {
				System.out.print(in.read() + " ");
			}
			in.close();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error: Cannot open file for reading.");
		} catch (EOFException e) {
			//e.printStackTrace();
			System.out.println("Error: EOF encountered, file may be corrupted.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Error: Cannot read from file.");
		}
	}
}
