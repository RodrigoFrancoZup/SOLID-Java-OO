package cap2.br.com.alura.solid.main;

import java.util.List;

import cap2.br.com.alura.solid.modelo.Fatura;
import cap2.br.com.alura.solid.modelo.NotaFiscal;
import cap2.br.com.alura.solid.service.Acoes;

public class GeradorDeNotaFiscal {

	List<Acoes> acoes;

	public GeradorDeNotaFiscal(List<Acoes> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (Acoes aux : acoes) {
			aux.acaoPosGerarNota(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
