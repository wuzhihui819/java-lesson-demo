
public class Break {
	public static void main(String[] args) {
		int i, j = 0, k = 0, h;
		label1: for (i = 0; i < 100; i++, j += 2)
			label2: {
				label3: switch (i % 2) {
				case 1:
					h = 1;
					break;
				default:
					h = 0;
					break;
				}
				if (i == 50)
					break label1;
			}
		System.out.println("i=" + i);
	}
}
