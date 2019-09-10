import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("myAccount2.txt"));
			BankAccount aBankAccount = new BankAccount();
			aBankAccount.setOwnerName(in.readLine());
			aBankAccount.setAccountNumber(Integer.parseInt(in.readLine()));
			in.read(); // $
			aBankAccount.deposit(Float.parseFloat(in.readLine()));
			in.close();
			System.out.println(aBankAccount);
			System.out.println(aBankAccount.getOwnerName() + " " + aBankAccount.getAccountNumber() + " "
					+ aBankAccount.getBalance());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
