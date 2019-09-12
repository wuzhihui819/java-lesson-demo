public class TwoThread implements Runnable{
	private int i;
	@Override
	public void run() {
		for(;i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "\t" +i);
			if(i == 20) {
				System.out.println(Thread.currentThread().getName() + "\t" + "over");
			}
		}
	}

}
