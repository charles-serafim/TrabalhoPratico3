package loja.de.roupas;

import java.awt.image.BufferedImage;

public class CamisaDeTime extends Produto {

	private String edicao;
	private String time;
	private String origemTime;
	private String tipoLogo;
	private String tipoManga;
	private String tipoGola;
	private String corte;
	private String nomePessoa;
	private int numeracao;
	
	public CamisaDeTime(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String e, String t, String o, String tL, String tM, String tG, String ct, String nP, int num) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		edicao = e;
		time = t;
		origemTime = o;
		tipoLogo = tL;
		tipoManga = tM;
		tipoGola = tG;
		corte = ct;
		nomePessoa = nP;
		numeracao = num;
	}

	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrigemTime() {
		return origemTime;
	}
	public void setOrigemTime(String origemTime) {
		this.origemTime = origemTime;
	}
	public String getTipoLogo() {
		return tipoLogo;
	}
	public void setTipoLogo(String tipoLogo) {
		this.tipoLogo = tipoLogo;
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
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public int getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
		

}
