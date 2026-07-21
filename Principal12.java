interface Impressora{
    void imprimir(String texto);
}

class Numero{
    void mostradoNumero(int numero){
        System.out.println("Numero:" + numero);
    }
}

class NumeroInteiro extends Numero implements Impressora{
    void dobro(int numero){
        System.out.println("Dobro:" + (numero*2));
    }

    @Override
    public void imprimir(String texto){
        System.out.println("Imprinmindo:" + texto);
    }
}

public class Principal12{
    public static void main(String[] args){
        NumeroInteiro n = new NumeroInteiro();
        n.mostradoNumero(25);
        n.dobro(25);
        n.imprimir("Operação concluída");
    }
}