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

        ArrayList<Integer> escolhaUser = new ArrayList<Integer>(6);
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(6);

        //Criando os números aleatórios.






        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10 - 1) + 1;
            numerosAleatorios.add(num);
            Collections.sort(numerosAleatorios);





        }
        System.out.println("\nDigite os 6 números: ");
        for (int i = 0; i < 6; i++) {
            numero = scanner.nextInt();
            escolhaUser.add(numero);
            Collections.sort(escolhaUser);
            if (numerosAleatorios.contains(numero)) {
                acertos++;

            }
        }

        System.out.println("Os números da Mega-sena foram: ");
        System.out.println(escolhaUser);
        System.out.println(numerosAleatorios);

        System.out.println("\nPontuação: " + acertos);


    }
}
