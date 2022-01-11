import java.util.Scanner;

public class ExercicioWhileNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("\nDigite sua nota entre 0 e 10");
        nota = scanner.nextDouble();

        while (nota < 0 | nota > 10) {
            System.out.println("\nDigite sua nota entre 0 e 10");
            nota = scanner.nextDouble();


        }
        System.out.println("Nota corretamente digitada.");
    }
}
