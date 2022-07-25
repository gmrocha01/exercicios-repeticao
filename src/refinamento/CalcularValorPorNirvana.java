package refinamento;

import java.util.Random;
import java.util.Scanner;

public class CalcularValorPorNirvana {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas nirvanas fará:");
        int qtd = scan.nextInt();
        int espiritos = 0;
        int elementos = 0;

        for (int i = 1; i <= 9 * qtd; i++) {
            int numero = gerador.nextInt(2);
            if (numero == 1) {
                espiritos++;
            }
            if (numero == 0) {
                elementos++;
            }
        }
        int totalElementos = elementos + (11 * qtd);
        double lucro = (totalElementos * 1.45) + (espiritos * 5.4) - (qtd * 12);

        System.out.println("A quantidade de Cristais dos Elementos em " + qtd + " nirvanas foi aproximadamente: " + totalElementos);
        System.out.println("A quantidade de Cristais dos Espiritos em " + qtd + " nirvanas foi aproximadamente: " + espiritos);
        System.out.printf("\nO valor de lucro em Cristais dos Espiritos e Elementos foi: %.2fKK", lucro);
        double conversaoElementosParaEspiritos = (totalElementos * 1.6) / 5.5;
        System.out.printf("\n\nCaso venda os Cristais dos Elementos e troque para Cristais dos Espiritos, " +
                "o resultado em Cristais dos Espíritos será: %.0f ", conversaoElementosParaEspiritos);

    }
}
