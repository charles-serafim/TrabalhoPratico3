package loja.de.roupas;

import java.util.Date;

public class Cliente {
	
	private String nomeCivil;
	private String nomeSocial;
	private String email;
	private Date nascimento;
	private int cpf;
	private Telefone telefone;
	private Endereco endereco;
	
	public Cliente(String nc, String ns, String mail, Date n, int c, Telefone t, Endereco e) {
		nomeCivil = nc;
		nomeSocial = ns;
		email = mail;
		nascimento = n;
		cpf = c;
		telefone = t;
		endereco = e;
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
	

}
