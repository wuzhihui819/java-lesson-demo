public class CalculatorTest2 {
	public static void main(String[] args) {
		int numbers[] = { 23, 54, 88, 98, 23, 54, 7, 72, 35, 22 };
		System.out.println("The average is " + Calculator.calculateAverage(numbers));
		System.out.println("The maximum is " + Calculator.findMaximum(numbers));
	}
}
