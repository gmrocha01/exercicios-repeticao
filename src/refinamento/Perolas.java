package refinamento;

import java.text.DecimalFormat;

public class Perolas {

    public static int fragPerola4 = 2;
    public static int fragPerola5 = 3;
    public static int fragPerola6 = 15;
    public static int fragPerola7 = fragPerola6 + fragPerola5 + fragPerola4;
    public static int fragPerola8 = fragPerola7 + fragPerola6 + fragPerola5;
    public static int fragPerola9 = fragPerola8 + fragPerola6 + fragPerola7;
    public static int fragPerola10 = fragPerola9 + fragPerola8 + fragPerola7;

    public static int perola4;
    public static int perola5;
    public static int perola6;
    public static int perola7 = perola4 + perola5 + perola6;
    public static int perola8 = perola5 + perola6 + perola7;
    public static int perola9 = perola6 + perola7 + perola8;
    public static int perola10 = perola7 + perola8 + perola9;


    public static double criarPerola7(int qtd) {
        double valor = 0.91;
        return valor;
    }

    public static double criarPerola8(int qtd) {
        double valor = 1.05;
        return criarPerola7(1) + valor;
    }

    public static double criarPerola9(int qtd) {
        double valor = 1.19;
        return criarPerola8(1) + criarPerola7(1) + valor;
    }

    public static double criarPerola10(int qtd) {
        double valor = 1.33;
        double total = (criarPerola9(1) + criarPerola8(1) + criarPerola7(1) + valor);
        return total;
    }

    public static void qtdPerolasPara7() {
        perola6 = 1;
        perola5 = 1;
        perola4 = 1;
        System.out.println("Total de Pedras para PEROLA 7:\n");
        System.out.println("Pérolas 4: " + perola4);
        System.out.println("Pérolas 5: " + perola5);
        System.out.println("Pérolas 6: " + perola6);
        System.out.println("Fragmentos necessários: " + fragPerola7);
    }

    public static void qtdPerolasPara8() {
        perola6 = 2;
        perola5 = 2;
        perola4 = 1;
        System.out.println("Total de Pedras para PEROLA 8:\n");
        System.out.println("Pérolas 4: " + perola4);
        System.out.println("Pérolas 5: " + perola5);
        System.out.println("Pérolas 6: " + perola6);
        System.out.println("Fragmentos necessários: " + fragPerola8);
    }

    public static void qtdPerolasPara9() {
        perola6 = 4;
        perola5 = 3;
        perola4 = 2;
        System.out.println("Total de Pedras para PEROLA 9:\n");
        System.out.println("Pérolas 4: " + perola4);
        System.out.println("Pérolas 5: " + perola5);
        System.out.println("Pérolas 6: " + perola6);
        System.out.println("Fragmentos necessários: " + fragPerola9);
    }

    public static void qtdPerolasPara10() {
        perola6 = 7;
        perola5 = 6;
        perola4 = 4;
        System.out.println("Total de Pedras para PEROLA 10:\n");
        System.out.println("Pérolas 4: " + perola4);
        System.out.println("Pérolas 5: " + perola5);
        System.out.println("Pérolas 6: " + perola6);
        System.out.println("Fragmentos necessários: " + fragPerola10);
    }

    public static void totalParaCriar() {
        perola4 = 9;
        perola5 = 13;
        perola6 = 15;
        perola7 = 7;
        perola8 = 3;
        perola9 = 2;
        System.out.println("TOTAL PARA CRIAR OS REFINOS DE +4 A +10:");
        System.out.println("Pérolas 4: " + perola4);
        System.out.println("Pérolas 5: " + perola5);
        System.out.println("Pérolas 6: " + perola6);
        System.out.println("Pérolas 7: " + perola7);
        System.out.println("Pérolas 8: " + perola8);
        System.out.println("Pérolas 9: " + perola9);
        System.out.println("Fragmentos necessários: " + (fragPerola10 + fragPerola9 + fragPerola8 + fragPerola7 + fragPerola6
                + fragPerola5 + fragPerola4));
        double total = criarPerola7(7) + criarPerola8(3) + criarPerola9(2) + criarPerola10(1);
        System.out.println("O total em dinheiro é: " + total + "KK");

    }
}
