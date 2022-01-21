package ProjetoNo;

public class Main {
    public static void main(String[] args) {
        //Criando referencia da variável no1 com a classe No (criando objetos)
        No<String> no1 = new No<String>("Conteúdo no1"); //Não é necessário colocar dentro do segundo "diamond" o tipo de dados.
        No<String> no2 = new No<>("Conteudo no2");

        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); //Ultimo nó referencia para null.
        System.out.println(no3.getConteudo());







    }
}
