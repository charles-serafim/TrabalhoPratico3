package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Top extends Produto {

	private String gramatura;
	private String sustentacao;
	private int comprimento;
	private String tipoAlca;
	private String tipoDecote;
	private String tipoEstampa;
	private String bojo;
	private String forro;
	
	public Top(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String gram, String sust, int comp, String tA, String tD, String tE, String boj, String forr) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		gramatura = gram;
		sustentacao = sust;
		comprimento = comp;
		tipoAlca = tA;
		tipoDecote = tD;
		tipoEstampa = tE;
		bojo = boj;
		forro = forr;
	}

	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getSustentacao() {
		return sustentacao;
	}
	public void setSustentacao(String sustentacao) {
		this.sustentacao = sustentacao;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public String getTipoAlca() {
		return tipoAlca;
	}
	public void setTipoAlca(String tipoAlca) {
		this.tipoAlca = tipoAlca;
	}
	public String getTipoDecote() {
		return tipoDecote;
	}
	public void setTipoDecote(String tipoDecote) {
		this.tipoDecote = tipoDecote;
	}
	public String getTipoEstampa() {
		return tipoEstampa;
	}
	public void setTipoEstampa(String tipoEstampa) {
		this.tipoEstampa = tipoEstampa;
	}
	public String getBojo() {
		return bojo;
	}
	public void setBojo(String bojo) {
		this.bojo = bojo;
	}
	public String getForro() {
		return forro;
	}
	public void setForro(String forro) {
		this.forro = forro;
	}

}
