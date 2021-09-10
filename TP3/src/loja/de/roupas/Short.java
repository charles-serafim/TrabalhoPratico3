package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Short extends Produto {

	private String gramatura;
	private String modelagem;
	private String tipoLogo;
	private int qtdBolsos;
	private String tipoBolso;
	private String tipoForro;
	private String tipoCintura;
	private String tipoCos;
	private int comprimento;
	private String respirabilidade;
	private String tipoLateral;
	private String tipoEstampa;
	
	public Short(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String gram, String mod, String tLogo, int qtdb, String tBol, String tF, String tCin, String tCos, String tBar, int comp, String resp,
			String tLa, String tE) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		gramatura = gram;
		modelagem = mod;
		tipoLogo = tLogo;
		qtdBolsos = qtdb;
		tipoBolso = tBol;
		tipoForro = tF;
		tipoCintura = tCin;
		tipoCos = tCos;
		comprimento = comp;
		respirabilidade = resp;
		tipoLateral = tLa;
		tipoEstampa = tE;
	}

	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getModelagem() {
		return modelagem;
	}
	public void setModelagem(String modelagem) {
		this.modelagem = modelagem;
	}
	public String getTipoLogo() {
		return tipoLogo;
	}
	public void setTipoLogo(String tipoLogo) {
		this.tipoLogo = tipoLogo;
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
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public String getRespirabilidade() {
		return respirabilidade;
	}
	public void setRespirabilidade(String respirabilidade) {
		this.respirabilidade = respirabilidade;
	}
	public String getTipoLateral() {
		return tipoLateral;
	}
	public void setTipoLateral(String tipoLateral) {
		this.tipoLateral = tipoLateral;
	}
	public String getTipoEstampa() {
		return tipoEstampa;
	}
	public void setTipoEstampa(String tipoEstampa) {
		this.tipoEstampa = tipoEstampa;
	}

}