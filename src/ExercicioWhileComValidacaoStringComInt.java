import java.util.Scanner;

public class ExercicioWhileComValidacaoStringComInt {

    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nome é ");
            nome = scanner.next();
            if (nome.matches("[0-9]*")) {
                System.out.println("Nome inválido, programa encerrado.");
                break;
            }
            System.out.println("/nSua idade é ");
            idade = scanner.nextInt();
        }



    }
}
