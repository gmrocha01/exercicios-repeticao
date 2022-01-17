import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class ExercicioNumeroRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[6];
        int[] escolhaUser = new int[6];
        int acertos = 0;
        int numero=0;

        //List<Integer> numerosAleatorios = new ArrayList <Integer>(6);
        //List<Integer> escolha = new ArrayList <Integer>(6);

        //Criando os números aleatórios.


        System.out.println("\nDigite os 6 números: ");
        for (int i = 0; i < escolhaUser.length; i++) {
            int imprimir = scanner.nextInt();
            imprimir = escolhaUser[i] ;
            }

        System.out.println("Os números da Mega-sena foram: ");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numero = random.nextInt(60);
            numerosAleatorios[i] = numero;
            if (numerosAleatorios[i] == numerosAleatorios[5]){
                System.out.print(numero+".");

            }
            else{
                System.out.print(numero +" , ");
            }


        }

        //System.out.println("\nPontuação: " + acertos);

    }






    }




