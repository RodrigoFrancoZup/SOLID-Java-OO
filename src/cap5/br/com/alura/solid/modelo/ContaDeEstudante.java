package cap5.br.com.alura.solid.modelo;

public class ContaDeEstudante {

	private int milhas;

	private GerenciamentoDeSaldo gerenciamentoDeSaldo;

	public ContaDeEstudante() {
		this.gerenciamentoDeSaldo = new GerenciamentoDeSaldo();
	}

	public void deposita(double valor) {
		gerenciamentoDeSaldo.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

}