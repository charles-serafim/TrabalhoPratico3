package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Macacao extends Produto {

	private String compressao;
	private int comprimento;
	private String tipoAlca;
	private String tipoDecote;
	private String tipoEstampa;
	private String bojo;
	private String bojoRemove;
	private String tipoManga;
	
	public Macacao(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p,
			String compress, int comprim, String tA, String tD, String tE, String boj, String bojR, String tM) {
		super(n, cod, m, d, g, fe, te, co, ta, fo, p);
		compressao = compress;
		comprimento = comprim;
		tipoAlca = tA;
		tipoDecote = tD;
		tipoEstampa = tE;
		bojo = boj;
		bojoRemove = bojR;
		tipoManga = tM;
	}

	public String getCompressao() {
		return compressao;
	}
	public void setCompressao(String compressao) {
		this.compressao = compressao;
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
	public String getBojoRemove() {
		return bojoRemove;
	}
	public void setBojoRemove(String bojoRemove) {
		this.bojoRemove = bojoRemove;
	}
	public String getTipoManga() {
		return tipoManga;
	}
	public void setTipoManga(String tipoManga) {
		this.tipoManga = tipoManga;
	}

}