package exe;

import cristians_algorithm.CristiansAlgorithm;
import threads.Process01;
import threads.Process02;

public class main {

	public static void main(String[] args) {

		Process01 Cliente = new Process01(0);
		Process02 Servidor = new Process02(50);
		
		Cliente.start();
		Servidor.start();
		
		Cliente.getTiempo();
		CristiansAlgorithm calculo = new CristiansAlgorithm(t0, t1);

	}
}
