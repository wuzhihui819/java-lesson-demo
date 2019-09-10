public class SubClass extends SuperClass{
	void showMyPosition() {
		System.out.println("At first I will go to superClass...");
		super.showMyPosition();
		System.out.println("Now I have moved to subclass!");
	}
}
