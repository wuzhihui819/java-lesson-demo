import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objectser implements Serializable{
	public static void main(String[] args) {
		Student stu = new Student(981036, "Li Ming", 16, "CSD");
		try {
			FileOutputStream fo = new FileOutputStream("data.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(stu);
			so.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
