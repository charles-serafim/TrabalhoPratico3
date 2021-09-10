package loja.de.roupas;

import java.awt.image.BufferedImage;

public class Registro {

	private Pedido[] pedido = new Pedido[500];
	private Cliente cliente;
	private Funcionario funcionario;
	private int cont;
	
	public Registro(Pedido[] p, Cliente c, Funcionario f, int i) {
		pedido[i] = p[i];
		cliente = c;
		funcionario = f;
	}

	public Pedido[] getPedido() {
		return pedido;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
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
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}

}
