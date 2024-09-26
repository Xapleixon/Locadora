package pacote;

public class Aluguel {
	
    private Cliente cliente;
    private Filme filme;
    private double valor;
    private int dias;

	//this = esse objeto(cliente) tem esses dados:...

    public Aluguel(Cliente cliente, Filme filme, double valor, int dias) {
        this.cliente = cliente;
        this.filme = filme;
        this.valor = valor;
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public double getValor() {
        return valor;
    }

    public int getDias() {
        return dias;
    }
}