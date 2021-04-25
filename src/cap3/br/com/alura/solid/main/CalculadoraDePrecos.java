package cap3.br.com.alura.solid.main;

import cap3.br.com.alura.solid.service.ServicoDeEntrega;
import cap3.br.com.alura.solid.service.TabelaDePreco;

public class CalculadoraDePrecos {

	private TabelaDePreco tabela;
	private ServicoDeEntrega frete;

	CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega frete) {
		this.tabela = tabela;
		this.frete = frete;
	}

	public double calcula(Compra produto) {

		double desconto = tabela.descontoPara(produto.getValor());
		double ValorDofrete = frete.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + ValorDofrete;
	}
}