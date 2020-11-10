package cristians_algorithm;

public class CristiansAlgorithm{

	private int T0;
	private int T1;
	private int Cs;
	private int Resultado;
	
	public int SincronizarRelojes(int CS, int T0, int T1) {
		this.Cs = CS;
		this.T0 = T0;
		this.T1 = T1;
		
		Resultado = this.Cs + (this.T1-this.T0)/2;
		
		return Resultado;
	}
	
	
	public int getCs() {
		return Cs;
	}
	public void setCs(int cs) {
		Cs = cs;
	}
	public int getT0() {
		return T0;
	}
	public void setT0(int t0) {
		T0 = t0;
	}
	public int getT1() {
		return T1;
	}
	public void setT1(int t1) {
		T1 = t1;
	}
}
