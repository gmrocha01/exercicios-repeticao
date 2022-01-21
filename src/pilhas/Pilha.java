package pilhas;

public class Pilha {
    private No refNoEntradaPilha; //Nó de refencia da entrada da pilha

    public Pilha() { //Construtor
        this.refNoEntradaPilha = null; //Quando instancia o nó a referencia é nula.
    }

    public No top() { //Retorna a referencia.
        return refNoEntradaPilha;
    }

    public void push(No novoNo){ //Empilha
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);

    }

    public No pop(){ //Método que exclui o ultimo elemento da pilha
        if (!this.isEmpty()){ //Se a lista não está vazia (!) executa o bloco de codigo.
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        else{
            return null;

        }

    }

    public boolean isEmpty(){ //Método para verificar se está vazio, se está vazio retorna true, se tá cheio retorna false.
        if (refNoEntradaPilha == null){
            return true;

        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno +="    Pilha\n";
        stringRetorno +="-----------------\n";
        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            else{
                break;
            }
        }
        stringRetorno += "==============\n";
        return  stringRetorno;
    }
}
