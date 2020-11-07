package threads;

public class Process01 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("P1");
		}
	}
}
