package pacote;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    	
    	Locadora locadora = new Locadora();
    //Aqui é chamado a classe "Locadora" e é renomeada para "locadora", facilitando e utilizando a classe dentro do 'Main'

   //Aqui os filmes são adicionados em nomes de variáveis diferentes, filme1, filme2, e eassim por diante
    Filme filme1 = new Filme("Gigantes de aço", "Shawn Levy","Hugh Jackman", "2011", 127, "Drama, Ação", 4.00);
    Filme filme2 = new Filme("Piratas do Caribe: A Maldição do Pérola Negra", "Gore Verbinski","Johnny Depp, Geoffrey Rush, Orlando Bloom", "2003", 143, "Ação", 6.00);
    Filme filme3 = new Filme("O Projeto Adam", "Shawn Levy","Ryan Reinolds, Walker Scobell, Mark Ruffalo", "2022", 106, "Ação", 8.00);
    Filme filme4 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Peter Jackson ", "Elijah Wood, Ian McKellen", "2001", 178, "Fantasia", 15.00);
    Filme filme5 = new Filme("Star Wars: O Império Contra-Ataca", "Irvin Kershner ", "Mark Hamill, Harrison Ford", "1980", 124, "Ficção Científica", 9.00);
    Filme filme6 = new Filme("Top Gun: Maverick", "Joseph Kosinski", "Tom Cruise, Jennifer Connelly, Miles Teller", "2022", 130, "Ação", 8.00);
    Filme filme7 = new Filme("O Bom Dinossauro", "Kelsey Mann", "Jeffrey Wright, Frances McDormand, Maleah Nipay-Padilla", "2015", 93, "Animação", 6.00);
    Filme filme8 = new Filme("Jogos Mortais X", "Kevin Greutert", "Tobin Bell, Shawnee Smith, Synnove Macody Lund", "2023", 118, "Terror", 10.00);
    Filme filme9 = new Filme("Sorria", "Parker Finn", "Sosie Bacon, Jessie T. Usher, Kyle Gallner", "2022", 115, "Mistério", 9.00);
    Filme filme10 = new Filme("Divertida Mente 2", "Kelsey Mann", "Amy Poehler, Maya Hawke, Kensington Tallman", "2024", 96, "Animação", 9.00);

    //Aqui os filmes são adicionados num método existente na classe locadora chamado: "adicionarFilme".
    locadora.adicionarFilme(filme1);
    locadora.adicionarFilme(filme2);
    locadora.adicionarFilme(filme3);
    locadora.adicionarFilme(filme4);
    locadora.adicionarFilme(filme5);
    locadora.adicionarFilme(filme6);
    locadora.adicionarFilme(filme7);
    locadora.adicionarFilme(filme8);
    locadora.adicionarFilme(filme9);
    locadora.adicionarFilme(filme10);
    
    //Aqui é igual a parte dos filmes, mas com clientes
    Cliente cliente1 = new Cliente("Daniel Magnus", 17, "10010010010");
    Cliente cliente2 = new Cliente("Alessandra Platen", 17, "10110110101");
    Cliente cliente3 = new Cliente("Gustavo Kubiaki", 19, "11111111111");
    Cliente cliente4 = new Cliente("Pedro Goelzer", 17, "00100100100");
    Cliente cliente5 = new Cliente("Alexsander Soares", 18, "01001001010");
    Cliente cliente6 = new Cliente("Juliano Oliveira", 23, "18347980241");
    Cliente cliente7 = new Cliente("Marcello Cauê", 32, "15023987589");
    Cliente cliente8 = new Cliente("Lucas Rodrigues", 18, "07580341896");
    Cliente cliente9 = new Cliente("Luiza Motta", 16, "67482347158");
    Cliente cliente10 = new Cliente("Fernanda Almeida", 17, "89674532101");
    Cliente cliente11 = new Cliente("Tânia Alves", 17, "14123656325");
    Cliente cliente12 = new Cliente("João Batista", 21, "18745693201");
    Cliente cliente13 = new Cliente("Caio Castro", 27, "74582639856");
    Cliente cliente14 = new Cliente("Davi Duarte", 23, "37145287457");
    Cliente cliente15 = new Cliente("Alex ferreira", 24, "14125214875");
    Cliente cliente16 = new Cliente("Júlia Garcia", 19, "36589856301");
    Cliente cliente17 = new Cliente("Carlos Gomes", 20, "17458236958");
    Cliente cliente18 = new Cliente("Luis Lopes", 22, "14525252025");
    Cliente cliente19 = new Cliente("Ferdinando Nascimento", 24, "35741289601");
    Cliente cliente20 = new Cliente("Jucimar Santana", 28, "02589631470");

    //O mesmo, mas com clientes
    locadora.adicionaClientes(cliente1);
    locadora.adicionaClientes(cliente2);
    locadora.adicionaClientes(cliente3);
    locadora.adicionaClientes(cliente4);
    locadora.adicionaClientes(cliente5);
    locadora.adicionaClientes(cliente6);
    locadora.adicionaClientes(cliente7);
    locadora.adicionaClientes(cliente8);
    locadora.adicionaClientes(cliente9);
    locadora.adicionaClientes(cliente10);
    locadora.adicionaClientes(cliente11);
    locadora.adicionaClientes(cliente12);
    locadora.adicionaClientes(cliente13);
    locadora.adicionaClientes(cliente14);
    locadora.adicionaClientes(cliente15);
    locadora.adicionaClientes(cliente16);
    locadora.adicionaClientes(cliente17);
    locadora.adicionaClientes(cliente18);
    locadora.adicionaClientes(cliente19);
    locadora.adicionaClientes(cliente20);
    
    //Nesse trecho cada cliente faz uma nova locação, pega a data atual e subtrai os dias 'minusDays', 
    //depois tem o valor a ser pago.
    cliente2.adicionarLocacao(new Locacao(filme3, LocalDate.now().minusDays(5), 8.00));
    cliente5.adicionarLocacao(new Locacao(filme2, LocalDate.now().minusDays(5), 6.00));
    cliente8.adicionarLocacao(new Locacao(filme1, LocalDate.now().minusDays(8), 4.00));
    cliente12.adicionarLocacao(new Locacao(filme4, LocalDate.now().minusDays(10), 10.00));
    cliente12.adicionarLocacao(new Locacao(filme5, LocalDate.now().minusDays(20), 5.00));
    cliente18.adicionarLocacao(new Locacao(filme4, LocalDate.now().minusDays(4), 10.00));
    cliente17.adicionarLocacao(new Locacao(filme7, LocalDate.now().minusDays(21), 7.00));
    cliente19.adicionarLocacao(new Locacao(filme10, LocalDate.now().minusDays(21), 9.00));
    cliente20.adicionarLocacao(new Locacao(filme10, LocalDate.now().minusDays(22), 9.00));
    cliente20.adicionarLocacao(new Locacao(filme8, LocalDate.now().minusDays(27), 10.00));
    cliente4.adicionarLocacao(new Locacao(filme5, LocalDate.now().minusDays(20), 5.00));
    cliente13.adicionarLocacao(new Locacao(filme2, LocalDate.now().minusDays(19), 6.00));
    cliente5.adicionarLocacao(new Locacao(filme7, LocalDate.now().minusDays(14), 7.00));
    cliente2.adicionarLocacao(new Locacao(filme9, LocalDate.now().minusDays(12), 9.00));
    cliente3.adicionarLocacao(new Locacao(filme1, LocalDate.now().minusDays(7), 4.00));
    cliente4.adicionarLocacao(new Locacao(filme4, LocalDate.now().minusDays(25), 10.00));
    cliente4.adicionarLocacao(new Locacao(filme10, LocalDate.now().minusDays(9), 9.00));
    cliente2.adicionarLocacao(new Locacao(filme10, LocalDate.now().minusDays(8), 9.00));
    cliente5.adicionarLocacao(new Locacao(filme9, LocalDate.now().minusDays(30), 9.00));
    cliente2.adicionarLocacao(new Locacao(filme1, LocalDate.now().minusDays(30), 4.00));
    cliente1.adicionarLocacao(new Locacao(filme1, LocalDate.now().minusDays(7), 4.00));
    cliente5.adicionarLocacao(new Locacao(filme6, LocalDate.now().minusDays(7), 8.00));
    cliente2.adicionarLocacao(new Locacao(filme2, LocalDate.now().minusDays(7), 6.00));
    cliente3.adicionarLocacao(new Locacao(filme10, LocalDate.now().minusDays(20), 9.00));

    System.out.println("  \n======CLIENTES CADASTRADOS====== \n");
    for (Cliente cliente : locadora.getClientes()) {
        System.out.println(cliente);
    }

    
    System.out.println("\n \n  ======FILMES DISPONÍVEIS====== ");
    for (Filme filme : locadora.getCatalogoFilmes()) {
        System.out.println(filme);
    }

    
    System.out.println("\n \n  ======FILME MAIS LOCADO======");
    Filme filmeMaisLocado = locadora.filmeMaisLocado();
    if (filmeMaisLocado != null) {
        System.out.println(filmeMaisLocado);
    } 
    
    
    
    System.out.println("\n \n  ======VALOR TOTAL DE LOCAÇÕES NO ÚLTIMO MÊS======");
    double valorTotalLocacoes = locadora.ValorTotalUltimoMes();
    System.out.println("		    R$ " + valorTotalLocacoes);
    
    
    System.out.println("\n	\n  ======CLIENTES QUE JÁ LOCARAM FILMES======");
    for (Cliente cliente : locadora.getClientes()) {
    	if (!cliente.getLocacoes().isEmpty()) // 'isEmpty' retorna 'true' caso seja vazio, para não dar problema caso dê 'false'
    		{
    		System.out.println(cliente);
    	}
    }
    
    
    System.out.println("\n	\n  ======CLIENTE QUE MAIS LOCOU:======");
    Cliente clienteMaisLocou = locadora.clienteMaisLocou();
    	if (clienteMaisLocou != null) //Se o 'clienteMaisLocou' for diferente de nulo, printa o 'clienteMaisLocou'
    {
    System.out.println(clienteMaisLocou);
    } 
    
    
    System.out.println("\n	\n  ======FILME MAIS LOCADO NA SEMANA PASSADA======");
    Filme filmeSemanaPassada = locadora.filmeSemanaPassada();
    	if (filmeSemanaPassada != null) {
    		System.out.println(filmeSemanaPassada);
    	}
    	
    	
    	System.out.println("\n	\n  ======FILMES ENTRE R$5,00 E R$10,00:======");
    		ArrayList<Filme> filmesFaixaPreco = locadora.buscarFilmesFaixaPreco(5.00, 10.00);
    		for (Filme Precofilme : filmesFaixaPreco) {
    			System.out.println(Precofilme);
    		}
    
    		
    		System.out.println("\n  \n  ======CATEGORIA DE FILMES DE AÇÃO======");
    	ArrayList <Filme> filmesDeAcao = locadora.buscarCategoria("Ação");
    	for (Filme filmeAcao : filmesDeAcao) {
    	System.out.println(filmeAcao);
    	}
    
    	
    	System.out.println("\n  \n  ======FILMES DO MESMO DIRETOR======");
    	ArrayList <Filme> filmeDiretor = locadora.buscarPorDiretor("Shawn Levy");
    	for (Filme filmePorDiretor : filmeDiretor) {
    		System.out.println(filmePorDiretor);
    		
    	//Buscar fazer o 'Main' de forma mais limpa nas próximas vezes :).

    	}
    }
}