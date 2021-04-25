package br.com.alura.solid.service;

import br.com.alura.solid.modelo.Funcionario;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().regra(funcionario);
	}
}