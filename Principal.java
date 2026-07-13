interface Impressora{
    void imprimir(String texto);
}

class ImpressoraLaser implements Impressora{

    @Override
    public void imprimir(String texto){
        System.out.println("Imprimindo:" + texto);
    }
}

public class Principal{
    public static void main(String[] args){
        ImpressoraLaser impressora = new ImpressoraLaser();

        impressora.imprimir("Relatório de vendas");
    }
}