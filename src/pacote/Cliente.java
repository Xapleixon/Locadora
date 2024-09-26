package pacote;

import java.util.ArrayList;
import java.util.List;

//ArrayList vai implementar os métodos de List e pode ter métodos mais específicos que List não vai ter

public class Cliente {
	private String nome;
	private int idade;
	private String id;
	private ArrayList<Locacao> locacoes;
	
	public Cliente(String nome, int idade, String id) {
		this.nome = nome;
		this.id = id;
		this.idade = idade;
		this.locacoes = new ArrayList<Locacao>();
	}

public String getNome() {
	return nome;
}

public int getidade() {
	return idade;
}

public String id() {
	return id;
}

public List<Locacao> getLocacoes(){
	return locacoes;
}

/*
 * //UM MÉTODO DEVE SER VOID QUANDO NÃO TEM QUE RETORNAR VALOR ALGUM.
 * 
 * EXEMPLO:
 *  
 * SEM RETORNO
 * public void soma(int i1, int i2)
 * { int x = i1+i2; }
 * System.out.println(soma(10,10)); 
 * //Erro de compilação. Soma return type is void.
 * 
 * 
 * //COM RETORNO
 * public int soma(int i1,int i2)
 * { int x = i1+i2;
 *  return x; }
 * System.out.println(soma(10,10)); 
 * //imprime 20
 */

public void adicionarLocacao(Locacao locacao) {
	this.locacoes.add(locacao);
	locacao.getFilme().AdicionarQuantidadeLocada();
}

@Override
public String toString () {
	return "ID: " + id +
           " - Nome: " + nome +
           " - Idade: " + idade;
	}
}
