package threads;

import java.io.IOException;
import java.io.PipedInputStream;

import cristians_algorithm.CristiansAlgorithm;

public class Process01 extends Thread {

	private int Tiempo;
	private int CS;
	private int TiempoActualizado;
	private PipedInputStream	pins	= new PipedInputStream();
	private CristiansAlgorithm	ca		= new CristiansAlgorithm();

	//Hilo corriendo de inicio definido hasta 100 segundos
	@Override
	public void run() {
		while (Tiempo < 151) {
			System.out.println("Reloj Cliente: " + getTiempo());
			MostrarTiempo();

			try {
				CS = pins.read();
				//System.out.println("Recibiendo tiempo de servidor: " + CS);
				
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//Iniciando sincronización después de 10 segundos
			if (Tiempo > 10) {
				TiempoActualizado = ca.SincronizarRelojes(CS, Tiempo, Tiempo+6);
				System.out.println("Reloj Cliente actualizado: "+TiempoActualizado);
				Tiempo = TiempoActualizado;
				//ca.start();
			}
			Tiempo++;
		}
		try {
			pins.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Método mostrar tiempo
	public int MostrarTiempo() {
		//System.out.println("Reloj Cliente: " + getTiempo());
		return getTiempo();
	}
	
	//Constructor, getters y setters
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
	public PipedInputStream getPins() {
		return pins;
	}
	public void setPins(PipedInputStream pins) {
		this.pins = pins;
	}
	
}
