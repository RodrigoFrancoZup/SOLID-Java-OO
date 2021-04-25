package br.com.alura.solid.service2;

import br.com.alura.solid.modelo2.NotaFiscal;

public class EnviadorDeEmail {

	public void enviaEmail(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}