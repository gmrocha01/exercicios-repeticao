import java.util.Scanner;

public class ExercicioArrayConsoanteRegex {
    /* Faça um programa que leia um vetor de 6 caracteres, e diga
           quantas consoantes foram lidas.
           Imprima as consoantes.
            */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cons = new String[6];
        int qtdConsoantes = 0;
        int contador = 0;
        //String consoante ="a";

        do {
            System.out.println("Digite: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") |
                    letra.matches("[0-9]*"))) {
                cons[contador] = letra;
                qtdConsoantes++;
            }
            contador++;

        } while (contador < cons.length);

        System.out.println("Consoantes: ");
        for (String consoante : cons) {

            if (consoante != null){
                System.out.println(consoante + " ");
            }
        }


    }

}


