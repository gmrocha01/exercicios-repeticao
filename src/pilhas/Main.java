package pilhas;

//Main de uma Pilha LIFO (Last in, first out)
public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No(1)); //Push adiciona
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop()); //POP vai remover o primeiro da lista (ultimo que foi colocado).
        System.out.println(minhaPilha);
    }
}
