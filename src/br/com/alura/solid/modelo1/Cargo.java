package br.com.alura.solid.modelo1;

import br.com.alura.solid.service1.DezOuVintePorcento;
import br.com.alura.solid.service1.QuinzeOuVinteCincoPorcento;
import br.com.alura.solid.service1.RegraDeCalculo;

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
