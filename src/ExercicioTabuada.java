import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado;
        //int count = 1;
        int num;

        /*System.out.println("Digite qual tabuada você quer:");                 laço com o Do While
        num = scanner.nextInt();

        do {
            resultado = num * count;
            System.out.println(+num+" x " +count+ " = " +resultado);
            count++;
        }while(count < 11);*/
        System.out.println("Digite qual tabuada você quer:");
        num = scanner.nextInt();

        for (int i=1;i<=10;i++){
            resultado = num * i;
            //System.out.println(num+" x " +i+ " = " +resultado);
            System.out.println(num+" x " +i+ " = " +(num*i));
        }
    }
}
