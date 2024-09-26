package pacote;

import java.time.LocalDate;
import java.util.ArrayList;

public class Locadora {
	private ArrayList<Filme> catalogoDeFilmes;
	private ArrayList<Cliente> clientes;

	public Locadora() {
		this.catalogoDeFilmes = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public void adicionarFilme(Filme filme) {
		catalogoDeFilmes.add(filme);
	}

	public void adicionaClientes(Cliente cliente) {
		clientes.add(cliente);
	}

	/*
	 * Os parâmetros são especificados após o nome do método, entre parênteses. Você
	 * pode adicionar quantos parâmetros quiser, basta separá-los com uma vírgula.
	 * Argumentos são informações que podem ser passadas para um método quando ele é chamado. 
	 * Sempre que qualquer método é chamada durante a execução do programa, alguns valores são passados com o método. 
	 * Esses valores são chamados de argumentos.
	 */

	public ArrayList<Filme> buscarFilmesTitulo(String titulo) {
		ArrayList<Filme> filmeEncontrado = new ArrayList<>();
		for (Filme filme : catalogoDeFilmes) {
			if (filme.getTitulo().equalsIgnoreCase(titulo)) {
				filmeEncontrado.add(filme);
			}
		}
		return filmeEncontrado;
	}

	//'equalsIgnoreCase' é usado para comparar duas strings enquanto ignora as diferenças de maiúsculas e minúsculas (inferior e superior).

	public ArrayList<Filme> buscarPorDiretor(String diretor) {
		ArrayList<Filme> filmeDiretor= new ArrayList<>();
		for (Filme filme : catalogoDeFilmes) {
			if (filme.getDiretor().equalsIgnoreCase(diretor)) {
				filmeDiretor.add(filme);
			}
		}
		return filmeDiretor;
	}


	public ArrayList<Filme> buscarCategoria(String categoria) {
		ArrayList<Filme> filmesCategoria = new ArrayList<>();
		for (Filme filme : catalogoDeFilmes) {
			if (filme.getCategoria().equalsIgnoreCase(categoria)) {
				filmesCategoria.add(filme);
			}
		}
		return filmesCategoria;
	}


	public ArrayList<Filme> filmesAlugadosDiasRecentes(int dias) {
		ArrayList<Filme> filmesAlugados = new ArrayList<>();
		LocalDate dataLimite = LocalDate.now().minusDays(dias);
		for (Cliente cliente : clientes) {
			for (Locacao locacao : cliente.getLocacoes()) {
				if (locacao.getdataLocacao().isAfter(dataLimite)) {
					filmesAlugados.add(locacao.getFilme());
				}
			}
		}
		return filmesAlugados;
	}


	public Filme filmeMaisLocado() {
		Filme filmeMaisLocado = null;
		int MaxLocacoes = 0;
		for (Filme filme : catalogoDeFilmes) {
			if (filme.getQuantidadeLocada() > MaxLocacoes) {
				MaxLocacoes = filme.getQuantidadeLocada();
				filmeMaisLocado = filme;
			}
		}

		return filmeMaisLocado;
	}


	// Neste método ele pega o valor total do último mês utilizando o import
	// "LocalDate"
	public double ValorTotalUltimoMes() {
		double valorTotal = 0;
		LocalDate inicioMesAtual = LocalDate.now().withDayOfMonth(1);
		for (Cliente cliente : clientes) {
			for (Locacao locacao : cliente.getLocacoes()) {

				// Abaixo ele verifica se é antes do mês anterior ou atual. Se for do mês
				// anterior ele adiciona no 'valorTotal'.
				if (locacao.getdataLocacao().isAfter(inicioMesAtual.minusMonths(1))
						&& locacao.getdataLocacao().isBefore(inicioMesAtual)) {
					valorTotal += locacao.getValor();
				}
			}
		}
		return valorTotal;
	}


	public Cliente clienteMaisLocou() {
		Cliente clienteMaisLocou = null;
		int MaxLocacoes = 0;
		for (Cliente cliente : clientes) {
			if (cliente.getLocacoes().size() > MaxLocacoes) {
				MaxLocacoes = cliente.getLocacoes().size(); // O método size retorna a quantidade de referências que a
															// lista está guardando
				clienteMaisLocou = cliente;
			}
		}
		return clienteMaisLocou;
	}


	public Filme filmeSemanaPassada() {
		Filme FilmeMaisLocado = null;
		int maxLocacoes = 0;
		LocalDate dataLimite = LocalDate.now().minusDays(7);

		// Para cada filme ele adiciona mais 1 na Arraylist (catalogoDeFilmes)
		for (Filme filme : catalogoDeFilmes) {
			int locacoesRecentes = 0;
			for (Cliente cliente : clientes) {
				for (Locacao locacao : cliente.getLocacoes()) {
					if (locacao.getFilme().equals(filme) && locacao.getdataLocacao().isAfter(dataLimite)) {
						locacoesRecentes++;
					}
				}
			}
			
			if (locacoesRecentes > maxLocacoes) {
				maxLocacoes = locacoesRecentes;
				FilmeMaisLocado = filme;
			}
		}
		return FilmeMaisLocado;
	}


	public ArrayList<Filme> buscarFilmesFaixaPreco(double precoMin, double precoMax) {
		ArrayList<Filme> filmesFaixaDePreco = new ArrayList<>();

		for (Filme filme : catalogoDeFilmes) {
			if (filme.getPrecoLocacao() >= precoMin && filme.getPrecoLocacao() <= precoMax) {
				filmesFaixaDePreco.add(filme);
			}
		}

		return filmesFaixaDePreco;
	}

	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	
	public ArrayList<Filme> getCatalogoFilmes() {
		return catalogoDeFilmes;
	}
}