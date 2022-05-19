package Calculadora;

public class CalculadoraCientifica extends Calculadora{
	
	private int expoente, raizQuadrada, seno, cosseno, tangente;
	
	public CalculadoraCientifica(int adicao,int subtracao, int divisao, int multiplicacao, int expoente, int raizQuadrada, int seno,
			int cosseno, int tangente) {
		super();
		this.expoente = expoente;
		this.raizQuadrada = raizQuadrada;
		this.seno = seno;
		this.cosseno = cosseno;
		this.tangente = tangente;
	}
	
	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}

	public int getRaizQuadrada() {
		return raizQuadrada;
	}

	public void setRaizQuadrada(int raizQuadrada) {
		this.raizQuadrada = raizQuadrada;
	}

	public int getSeno() {
		return seno;
	}

	public void setSeno(int seno) {
		this.seno = seno;
	}

	public int getCosseno() {
		return cosseno;
	}

	public void setCosseno(int cosseno) {
		this.cosseno = cosseno;
	}

	public int getTangente() {
		return tangente;
	}

	public void setTangente(int tangente) {
		this.tangente = tangente;
	}

	

}
