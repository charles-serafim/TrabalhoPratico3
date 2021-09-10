package loja.de.roupas;

public class Telefone {
	
	private int ddd;
	private int numero;
	
	public Telefone(int d, int n) {
		ddd = d;
		numero = n;
	}
	
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
