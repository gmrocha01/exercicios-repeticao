import java.util.Scanner;

public class ExercicioComparacaoArrays {
    public static void main(String[] args) {

        int pontuacao = 0, nota;
        String nome;

        Scanner sc = new Scanner(System.in);

        int gabaritoVetor[] = new int[3];
        int notaVetor[] = new int[3];

        System.out.println("Digite o gabarito: ");
        for (int c = 0; c < gabaritoVetor.length; c++) {
            System.out.print("Gabarito | questão[" + c + "]: ");
            gabaritoVetor[c] = sc.nextInt();

        }
        for (int i = 0; i < notaVetor.length; i++) {
            System.out.print("Questão[" + i + "]: ");
            notaVetor[i] = sc.nextInt();
            if (notaVetor[i] == gabaritoVetor[i])
                pontuacao++;
        }

        System.out.println("Pontuação: " + pontuacao);
    }
}
