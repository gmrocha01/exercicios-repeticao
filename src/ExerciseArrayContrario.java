public class ExerciseArrayContrario {
    public static void main(String[] args) {
        int[] vetor = {1,2,5,6,7};
        //int i = 0;
        int a = 0;

        //FOR COM ORDEM INVERSA !!!!!
        for(int i = (vetor.length - 1); i >= 0 ; i--){
            System.out.println("aaaaaaa " +vetor[i]);
        }
        //COM ORDEM NORMAL
        System.out.println("\n\n");
        while (a < (vetor.length)){ //Pode usar também (i < vetor.length)
            System.out.println("Posição: "+vetor[a]);
            a++;
        }
    }
}
