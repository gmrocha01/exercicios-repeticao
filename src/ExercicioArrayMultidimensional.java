import java.util.Random;

public class ExercicioArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);

            }


        }
        for (int[] linha : array) { //FOREACH mostrando um array mult
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna+" ");

            }
            System.out.println("\n");

        }
    }
}
