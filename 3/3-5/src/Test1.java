import java.text.NumberFormat;

public class Test1 {
	public static void main(String[] args) {
		Double myNumber = 12345.123456789;
		Double test = 1.2345;
		String myString = NumberFormat.getInstance().format(myNumber);
		System.out.println("Ĭ�ϸ�ʽ��" + myString);
		myString = NumberFormat.getCurrencyInstance().format(myNumber);
		System.out.println("ͨ�ø�ʽ��" + myString);
		myString = NumberFormat.getNumberInstance().format(myNumber);
		System.out.println("ͨ����ֵ��ʽ��" + myString);
		myString = NumberFormat.getPercentInstance().format(myNumber);
		System.out.println("�ٷֱȸ�ʽ��" + myString);
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(5);
		format.setMaximumIntegerDigits(10);
		format.setMinimumIntegerDigits(0);
		System.out.println(format.format(12345679.123456789));
	}
}
