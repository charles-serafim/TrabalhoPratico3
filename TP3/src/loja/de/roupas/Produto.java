package loja.de.roupas;

import java.awt.image.BufferedImage;

public abstract class Produto {

	protected String nome;
	protected String codigo;
	protected String marca;
	protected String descricao;
	protected String genero;
	protected String faixaEtaria;
	protected String tecido;
	protected String cor;
	protected String tamanho;
	protected BufferedImage foto;
	protected double preco;
	
	public Produto(String n, String cod, String m, String d, String g, String fe, String te, String co, String ta, BufferedImage fo, double p) {
		nome = n;
		codigo = cod;
		marca = m;
		descricao = d;
		genero = g;
		faixaEtaria = fe;
		tecido = te;
		cor = co;
		tamanho = ta;
		foto = fo;
		preco = p;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public BufferedImage getFoto() {
		return foto;
	}

	public void setFoto(BufferedImage foto) {
		this.foto = foto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	}
