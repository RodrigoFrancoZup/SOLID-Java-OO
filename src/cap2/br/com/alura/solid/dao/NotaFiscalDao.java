package cap2.br.com.alura.solid.dao;

import cap2.br.com.alura.solid.modelo.NotaFiscal;
import cap2.br.com.alura.solid.service.Acoes;

public class NotaFiscalDao implements Acoes {

	public void acaoPosGerarNota(NotaFiscal nf) {
		System.out.println("salva nf no banco");
		
	}
}