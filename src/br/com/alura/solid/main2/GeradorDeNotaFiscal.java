package br.com.alura.solid.main2;

import java.util.List;

import br.com.alura.solid.modelo2.Fatura;
import br.com.alura.solid.modelo2.NotaFiscal;
import br.com.alura.solid.service2.Acoes;

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
