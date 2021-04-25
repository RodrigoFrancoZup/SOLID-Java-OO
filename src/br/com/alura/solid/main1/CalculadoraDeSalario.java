package br.com.alura.solid.main1;

import br.com.alura.solid.modelo1.Funcionario;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().regra(funcionario);
	}
}