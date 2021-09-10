package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Loja {
	
	private int cnpj;
	private Endereco endereco;
	private Telefone telefone;
	private int abertura;
	private int fechamento;
	private Produto[] produtos = new Produto[500];
	private int[] quantidades = new int[500];
	private int contador;

	public Loja(int c, Endereco e, Telefone t, int a, int f, Produto[] p, int [] q, int i) {
		cnpj = c;
		endereco = e;
		telefone = t;
		abertura = a;
		fechamento = f;
		produtos[i] = p[i];
		quantidades[i] = q[i];
	}
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public int getAbertura() {
		return abertura;
	}

	public void setAbertura(int abertura) {
		this.abertura = abertura;
	}

	public int getFechamento() {
		return fechamento;
	}

	public void setFechamento(int fechamento) {
		this.fechamento = fechamento;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public int[] getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(int[] quantidades) {
		this.quantidades = quantidades;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
