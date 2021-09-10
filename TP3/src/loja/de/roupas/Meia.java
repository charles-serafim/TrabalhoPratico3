package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Meia extends Produto {

	private String alturaCano;
	private String punho;
	private String sola;
	private String tipoEstampa;
	
	public Meia(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String aC, String pun, String sol, String tE) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		alturaCano = aC;
		punho = pun;
		sola = sol;
		tipoEstampa = tE;
	}

	public String getAlturaCano() {
		return alturaCano;
	}
	public void setAlturaCano(String alturaCano) {
		this.alturaCano = alturaCano;
	}
	public String getPunho() {
		return punho;
	}
	public void setPunho(String punho) {
		this.punho = punho;
	}
	public String getSola() {
		return sola;
	}
	public void setSola(String sola) {
		this.sola = sola;
	}
	public String getTipoEstampa() {
		return tipoEstampa;
	}
	public void setTipoEstampa(String tipoEstampa) {
		this.tipoEstampa = tipoEstampa;
	}

}
