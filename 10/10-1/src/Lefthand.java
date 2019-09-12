public class Lefthand extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("I am Lefthand!");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
