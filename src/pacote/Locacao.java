package pacote;

import java.time.LocalDate; //Objeto data-tempo imutável
//fornece muitos métodos úteis para manipular e consultar datas, como adicionar ou subtrair dias,
//meses ou anos, obter o dia da semana ou verificar se uma data é anterior ou posterior a outra data.


public class Locacao {
	private Filme filme;
	private LocalDate dataLocacao;
	private double valor;
	
	public Locacao(Filme filme, LocalDate dataLocacao, double valor) {
		this.filme = filme;
		this.dataLocacao = dataLocacao;
		this.valor = valor;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public LocalDate getdataLocacao () {
		return dataLocacao;
	}
	
	public double getValor() {
		return valor;
	}
	
    @Override
    public String toString() {
        return "Locacao" +
                "filme" + filme +
                ", dataLocacao" + dataLocacao +
                ", valor" + valor;
}
    }
