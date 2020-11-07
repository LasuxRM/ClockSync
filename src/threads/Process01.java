package threads;

public class Process01 extends Thread {
	
	private int Tiempo;
	
	public Process01(int tiempo) {
		super();
		Tiempo = tiempo;
	}

	public int getTiempo() {
		return Tiempo;
	}
	public void setTiempo(int tiempo) {
		Tiempo = tiempo;
	}


	@Override
	public void run() {
		for (; Tiempo < 100; Tiempo++) {
			
			System.out.println("Reloj Cliente: " + Tiempo);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
