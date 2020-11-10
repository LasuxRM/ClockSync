package threads;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Process02 extends Thread {
	
	private int Tiempo;
    private PipedOutputStream	pouts	= new PipedOutputStream();
	
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
	public PipedOutputStream getPouts() {
		return pouts;
	}
	public void setPouts(PipedOutputStream pouts) {
		this.pouts = pouts;
	}

	@Override
	public void run() {
		
		while (Tiempo< 150) {
			System.out.println("Reloj Servidor: " + Tiempo);
			try {
				//System.out.println("Enviando tiempo de Servidor: " + Tiempo);
				//Enviando el Tiempo a PipedoOutputStream
				pouts.write(Tiempo);
				
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Tiempo++;
		}
		
		try {
			//Cerrando PipedOutputStream
			pouts.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
