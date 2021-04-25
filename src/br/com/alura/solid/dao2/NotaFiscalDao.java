package br.com.alura.solid.dao2;

import br.com.alura.solid.modelo2.NotaFiscal;
import br.com.alura.solid.service2.Acoes;

public class NotaFiscalDao implements Acoes {

	public void acaoPosGerarNota(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}
}