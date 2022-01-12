import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fatorial;
        double resul=1;

        System.out.println("Fatorial: ");
        fatorial = scanner.nextDouble();

        for(double i = fatorial; i >= 1; i--) {
            resul = resul * i;
            //System.out.println(fatorial +" != ");
            //System.out.println(resul);
        }
        System.out.println(fatorial +" != " +resul);

    }
}
