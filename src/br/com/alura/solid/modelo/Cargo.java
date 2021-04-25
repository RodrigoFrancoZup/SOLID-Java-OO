package br.com.alura.solid.modelo;

import br.com.alura.solid.service.DezOuVintePorcento;
import br.com.alura.solid.service.QuinzeOuVinteCincoPorcento;
import br.com.alura.solid.service.RegraDeCalculo;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento());

	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return this.regra;
	}

}
