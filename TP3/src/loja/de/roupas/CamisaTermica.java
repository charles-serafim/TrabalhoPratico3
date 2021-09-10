package loja.de.roupas;

import java.awt.image.BufferedImage;

public class CamisaTermica extends Produto {

	private String gramatura;
	private String tipoGola;
	private String tipoManga;
	private String isolamento;
	
	public CamisaTermica(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String gram, String tG, String tM, String isol) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		gramatura = gram;
		tipoGola = tG;
		tipoManga = tM;
		isolamento = isol;
	}

	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getTipoGola() {
		return tipoGola;
	}
	public void setTipoGola(String tipoGola) {
		this.tipoGola = tipoGola;
	}
	public String getTipoManga() {
		return tipoManga;
	}
	public void setTipoManga(String tipoManga) {
		this.tipoManga = tipoManga;
	}
	public String getIsolamento() {
		return isolamento;
	}
	public void setIsolamento(String isolamento) {
		this.isolamento = isolamento;
	}

}
