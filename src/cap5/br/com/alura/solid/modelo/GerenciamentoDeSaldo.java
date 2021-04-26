package cap5.br.com.alura.solid.modelo;

public class GerenciamentoDeSaldo {

	private Double saldo;

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void rende(Double taxa) {
		this.saldo *= this.saldo * taxa;
	}
}
