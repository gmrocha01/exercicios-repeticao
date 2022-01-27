package MegaSena;

import java.util.*;

public class Mega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //int[] numerosAleatorios = new int[6];
        //int[] escolhaUser = new int[6];
        int acertos = 0;
        int numero=0;

        ArrayList<Integer> escolhaUser = new ArrayList<Integer>(6); //ArrayList com tamanho 6
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(6); //ArrayList com tamanho 6

        //FOR criando os números aleatórios.

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10 - 1) + 1;
            numerosAleatorios.add(num);
            Collections.sort(numerosAleatorios);

        }

        //FOR solicitando os 6 números da aposta.

        System.out.println("\nDigite os 6 números: ");
        for (int i = 0; i < 6; i++) {
            numero = scanner.nextInt();
            escolhaUser.add(numero); //Adiciona o número digitado na lista.
            Collections.sort(escolhaUser);
            if (numerosAleatorios.contains(numero)) { //Faz uma busca na lista se contem o número digitado pelo usuário.
                acertos++;

            }
        }

        System.out.println("Os números da Mega-sena foram: ");
        System.out.println(escolhaUser); //Mostra a lista dos números digitados pelo usuário
        System.out.println(numerosAleatorios); //Mostra a lista dos números gerados randomicamente

        System.out.println("\nPontuação: " + acertos); //Mostra a pontuação do usuário relacionado aos números random.


    }
}
