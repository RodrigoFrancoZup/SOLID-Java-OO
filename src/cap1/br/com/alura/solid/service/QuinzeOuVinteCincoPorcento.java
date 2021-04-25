package cap1.br.com.alura.solid.service;

import cap1.br.com.alura.solid.modelo.Funcionario;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo {

	public double regra(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
