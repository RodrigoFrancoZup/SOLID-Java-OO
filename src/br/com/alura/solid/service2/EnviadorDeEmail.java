package br.com.alura.solid.service2;

import br.com.alura.solid.modelo2.NotaFiscal;

public class EnviadorDeEmail implements Acoes{

	public void acaoPosGerarNota(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}