package pacote;


public class Filme {
	//Isso são atributos
    private String titulo;
    private String diretor;
    private String elenco;
    private String dataLancamento;
    private int duracao;
    private String categoria;
    private double precoLocacao;
    private int quantidadeLocada;

    
    			//Esses também são atributos...
    public Filme(String titulo, String diretor, String elenco, String dataLancamento, int duracao, String categoria, double precoLocacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.dataLancamento = dataLancamento;
        this.duracao = duracao;
        this.categoria = categoria;
        this.precoLocacao = precoLocacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }
    
    public int getQuantidadeLocada() {
    	return quantidadeLocada;
    }
    
    public void AdicionarQuantidadeLocada() {
    	this.quantidadeLocada++;
    }
    
    @Override 
//A anotação @override é uma forma de garantir que estamos na verdade sobrescrevendo um método e não criando um novo.
    
    		   //"toString" retorna uma String representando o objeto
    public String toString() {
    	return "Título: " + titulo + 
                " - Diretor: " + diretor +
                " - Elenco: " + elenco +
                " - Lançamento: " + dataLancamento +
                " - Duração: " + duracao +
                " - Categoria: " + categoria +
                " - Preço: " + precoLocacao;
    }
    
}