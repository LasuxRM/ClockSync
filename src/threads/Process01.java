package threads;

public class Process01 extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Reloj Cliente: " + i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
