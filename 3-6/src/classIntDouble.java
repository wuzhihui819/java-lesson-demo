import java.text.DecimalFormat;
import java.util.Scanner;

public class classIntDouble {
	public static void main(String[] args) {
		int age;
		double weight, height, bmi;
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������䣺");
		age = scan.nextInt();
		System.out.println("�������������أ������");
		weight = scan.nextDouble();
		System.out.println("������������ߣ��ף���");
		height = scan.nextDouble();
		bmi = weight / ( height * height);
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("BMI:" + fmt.format(bmi));
		fmt = new DecimalFormat("0.##");
		System.out.println("BMI:" + fmt.format(bmi));
	}
}
