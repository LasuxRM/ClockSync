package exe;

import java.io.IOException;

import cristians_algorithm.CristiansAlgorithm;
import threads.Process01;
import threads.Process02;

public class main {

	public static void main(String[] args) throws IOException{
		
		int VP01;
		
		Process01 Cliente = new Process01(0);
		Process02 Servidor = new Process02(50);
		
		Servidor.getPouts().connect(Cliente.getPins());
		
		Cliente.start();
		Servidor.start();
		
	}
}
