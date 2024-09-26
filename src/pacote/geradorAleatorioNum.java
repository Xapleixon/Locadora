package pacote;

import java.util.Random;

class geradorAleatorioNum {

  public static void main(String[] args) {

        // instância um objeto da classe Random e específica a semente

        Random random = new Random(80);

        // imprime na tela uma sequência de 10 números inteiros aleatórios entre 0 e 50

        for (int i = 0; i < 20; i++) {

            System.out.println(random.nextInt(99999999));

         }

    }

}