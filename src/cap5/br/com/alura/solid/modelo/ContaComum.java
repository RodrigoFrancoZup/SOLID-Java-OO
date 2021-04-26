package cap5.br.com.alura.solid.modelo;

public class ContaComum {

	private GerenciamentoDeSaldo gerenciamentoDeSaldo;

	public ContaComum() {
		this.gerenciamentoDeSaldo = new GerenciamentoDeSaldo();
	}

	public void saca(Double valor) {
		gerenciamentoDeSaldo.saca(valor);
	}

	public void deposita(Double valor) {
		gerenciamentoDeSaldo.deposita(valor);
	}

	public void rende() {
		this.gerenciamentoDeSaldo.rende(1.1);
	}

	public Double getSaldo() {
		return this.gerenciamentoDeSaldo.getSaldo();
	}

}