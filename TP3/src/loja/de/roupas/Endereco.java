package loja.de.roupas;

public class Endereco {
	
	private int cep;
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String referencia;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(int ce, String l, int n, String b, String co, String r, String ci, String e, String p) {
		cep = ce;
		logradouro = l;
		numero = n;
		bairro = b;
		complemento = co;
		referencia = r;
		cidade = ci;
		estado = e;
		pais = p;
	}
	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
