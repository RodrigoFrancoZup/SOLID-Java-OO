package cap2.br.com.alura.solid.service;

import cap2.br.com.alura.solid.modelo.NotaFiscal;

public class EnviadorDeEmail implements Acoes{

	public void acaoPosGerarNota(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}