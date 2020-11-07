package exe;

import threads.Process01;
import threads.Process02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Process01 Cliente = new Process01();
		Process02 Servidor = new Process02();
		
		
		Cliente.start();
		Servidor.start();
	}

}
