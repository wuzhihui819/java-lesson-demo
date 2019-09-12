public class Righthand extends Thread{

	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("I am Righthand!");
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
