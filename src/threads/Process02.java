package threads;

public class Process02 extends Thread {
	
	private int Tiempo;
	
	public Process02(int tiempo) {
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
		
		for (; Tiempo < 150; Tiempo++) {
			
			System.out.println("Reloj Servidor: " + Tiempo);

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
