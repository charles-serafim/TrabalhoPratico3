package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Kimono extends Produto {

	private String tipoCos;
	private String casaco;
	private String lapela;
	private String faixa;
	
	public Kimono(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String tC, String cas, String lap, String fai) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		tipoCos = tC;
		casaco = cas;
		lapela = lap;
		faixa = fai;
	}

	public String getTipoCos() {
		return tipoCos;
	}
	public void setTipoCos(String tipoCos) {
		this.tipoCos = tipoCos;
	}
	public String getCasaco() {
		return casaco;
	}
	public void setCasaco(String casaco) {
		this.casaco = casaco;
	}
	public String getLapela() {
		return lapela;
	}
	public void setLapela(String lapela) {
		this.lapela = lapela;
	}
	public String getFaixa() {
		return faixa;
	}
	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

}
