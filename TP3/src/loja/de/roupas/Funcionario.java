package loja.de.roupas;

import java.util.Date;

public class Funcionario {
	
	private String nomeCivil;
	private String nomeSocial;
	private String email;
	private Date nascimento;
	private int cpf;
	private Telefone telefone;
	private Endereco endereco;
	private Date admissao;
	private int chegada;
	private int saida;
	

	public Funcionario(String nc, String ns, String mail, Date n, int cp, Telefone t, Endereco e, Date a, int ch, int s) {
		nomeCivil = nc;
		nomeSocial = ns;
		email = mail;
		nascimento = n;
		cpf = cp;
		telefone = t;
		endereco = e;
		admissao = a;
		chegada = ch;
		saida = s;
	}

	
	public String getNomeCivil() {
		return nomeCivil;
	}
	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public int getChegada() {
		return chegada;
	}
	public void setChegada(int chegada) {
		this.chegada = chegada;
	}
	public int getSaida() {
		return saida;
	}
	public void setSaida(int saida) {
		this.saida = saida;
	}
	
	
}
