package refinamento;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Perolas.qtdPerolasPara7();
        System.out.printf("O valor para criar uma pérola 7 é: %.2fKK\n", Perolas.criarPerola7(1));
        System.out.println("================================================================================\n");
        Perolas.qtdPerolasPara8();
        System.out.println();
        System.out.printf("O valor para criar uma pérola 8 é: %.2fKK\n", Perolas.criarPerola8(1));
        System.out.println("================================================================================\n");
        Perolas.qtdPerolasPara9();
        System.out.println();
        System.out.printf("O valor para criar uma pérola 9 é: %.2fKK\n", Perolas.criarPerola9(1));
        System.out.println("================================================================================\n");
        Perolas.qtdPerolasPara10();
        System.out.println();
        System.out.printf("O valor para criar uma pérola 10 é: %.2fKK\n", Perolas.criarPerola10(1));
        System.out.println("================================================================================\n");
        Perolas.totalParaCriar();


    }
}
