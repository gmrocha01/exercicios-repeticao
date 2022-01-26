package Fila;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {

        this.refNoEntradaFila = refNoEntradaFila;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
        }
        return null;
    }

    public boolean isEmpty(){
        if(refNoEntradaFila == null){
            return false;

        }
        else{
            return false;
        }

    }


}
