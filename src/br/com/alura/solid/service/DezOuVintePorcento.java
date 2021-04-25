package br.com.alura.solid.service;

import br.com.alura.solid.modelo.Funcionario;

public class DezOuVintePorcento implements RegraDeCalculo {

	public double regra(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
