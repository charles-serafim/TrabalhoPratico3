package loja.de.roupas;

import java.awt.image.BufferedImage;

public class CamisaCorrida extends Produto {

	private String gramatura;
	private String tipoManga;
	private String tipoGola;
	private String corte;
	
	public CamisaCorrida(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String gram, String tM, String tG, String ct) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		gramatura = gram;
		tipoManga = tM;
		tipoGola = tG;
		corte = ct;
	}

	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getTipoManga() {
		return tipoManga;
	}
	public void setTipoManga(String tipoManga) {
		this.tipoManga = tipoManga;
	}
	public String getTipoGola() {
		return tipoGola;
	}
	public void setTipoGola(String tipoGola) {
		this.tipoGola = tipoGola;
	}
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}

}
