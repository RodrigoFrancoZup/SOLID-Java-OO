package cap1.br.com.alura.solid.main;

import cap1.br.com.alura.solid.modelo.Funcionario;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().regra(funcionario);
		
	}
}