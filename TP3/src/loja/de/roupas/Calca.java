package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Calca extends Produto {

	private String gramatura;
	private int qtdBolsos;
	private String tipoBolso;
	private String tipoForro;
	private String tipoCintura;
	private String tipoCos;
	private String tipoBarra;
	private int comprimento;
	
	public Calca(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String gram, int qtdb, String tBol, String tF, String tCin, String tCos, String tBar, int comp) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		gramatura = gram;
		qtdBolsos = qtdb;
		tipoBolso = tBol;
		tipoForro = tF;
		tipoCintura = tCin;
		tipoCos = tCos;
		tipoBarra = tBar;
		comprimento = comp;
	}

	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public int getQtdBolsos() {
		return qtdBolsos;
	}
	public void setQtdBolsos(int qtdBolsos) {
		this.qtdBolsos = qtdBolsos;
	}
	public String getTipoBolso() {
		return tipoBolso;
	}
	public void setTipoBolso(String tipoBolso) {
		this.tipoBolso = tipoBolso;
	}
	public String getTipoForro() {
		return tipoForro;
	}
	public void setTipoForro(String tipoForro) {
		this.tipoForro = tipoForro;
	}
	public String getTipoCintura() {
		return tipoCintura;
	}
	public void setTipoCintura(String tipoCintura) {
		this.tipoCintura = tipoCintura;
	}
	public String getTipoCos() {
		return tipoCos;
	}
	public void setTipoCos(String tipoCos) {
		this.tipoCos = tipoCos;
	}
	public String getTipoBarra() {
		return tipoBarra;
	}
	public void setTipoBarra(String tipoBarra) {
		this.tipoBarra = tipoBarra;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

}
