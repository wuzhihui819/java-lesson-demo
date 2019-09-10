import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("myAccount2.txt"));
			BankAccount aBankAccount = new BankAccount("LiuWei", 2017);
			out.println(aBankAccount.getOwnerName());
			out.println(aBankAccount.getAccountNumber());
			out.println("$" + aBankAccount.getBalance());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
