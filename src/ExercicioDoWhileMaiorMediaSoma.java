import java.util.Scanner;

public class ExercicioDoWhileMaiorMediaSoma {
    /*
    Faça um programa que leia 5 números
    e informe o maior número e a média desses números
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num;
        double maior = 0;
        double media = 0;
        double soma = 0;
        int count=0;

        do {
            System.out.println("Número: ");
            num = scanner.nextDouble();
            if (num > maior){
                maior = num;
            }
            count++; //Pode usar também count = count + 1;
            soma = soma + num;


        }while(count < 5);
        System.out.println("O maior número é o "+maior);
        media = soma / count;
        System.out.println("A média é "+media);
        System.out.println("Soma é "+soma);



    }
}
