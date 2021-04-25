package cap4.br.com.alura.solid.main;

import java.util.List;

import cap4.br.com.alura.solid.modelo.Boleto;
import cap4.br.com.alura.solid.modelo.Fatura;
import cap4.br.com.alura.solid.modelo.MeioDePagamento;
import cap4.br.com.alura.solid.modelo.Pagamento;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.adicionaPagamento(pagamento);

		}

	}
}