package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Pedido {

	private Produto[] produtos = new Produto[500];
	private int[] quantidades = new int[500];
	private double total;
	private Cliente cliente;
	private Funcionario funcionario;
	private String pagamento;
	private int cont1;
	private int cont2;

/*	//Produto[] pro, int[] q, double t, Cliente c, Funcionario f, String p, int i, int j
	produtos[i] = pro[i];
	quantidades[i] = q[i];
	total = t;
	cliente = c;
	funcionario = f;
	pagamento = p;
	cont1 = i;
	cont2 = j;	*/
	
	public Pedido() {
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public int getCont1() {
		return cont1;
	}

	public void setCont1(int cont1) {
		this.cont1 = cont1;
	}

	public int getCont2() {
		return cont2;
	}

	public void setCont2(int cont2) {
		this.cont2 = cont2;
	}

}
