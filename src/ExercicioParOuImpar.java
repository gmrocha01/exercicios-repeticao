import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioParOuImpar {
    public static void main(String[] args) {
        double num;
        int count = 0;
        int qtdNum = 0;
        int par = 0;
        int impar = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar:");
        qtdNum = scanner.nextInt();
        //System.out.println("");
        do{
            System.out.println("Digite o número que quer verificar:");
            num = scanner.nextInt();
            count++;
            if ((num%2) == 0){
                System.out.println("O número é par");
                par = par +1;

            }
            else{
                System.out.println("O número é impar");
                impar = impar + 1;
            }

        }while(count < qtdNum);
        System.out.println("Quantidade de numero pares: "+par);
        System.out.println("Quantidade de numero impares: "+impar);


    }
}
