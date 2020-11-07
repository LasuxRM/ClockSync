package threads;

public class Process02 extends Thread {

	@Override
	public void run() {
		
		for (int i = 50; i < 150; i++) {
			
			System.out.println("Reloj Servidor: " + i);

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
