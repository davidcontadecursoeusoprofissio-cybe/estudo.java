interface Impressora{
    void imprimir(String texto);
}

class Veiculo{
    void mover(){
        System.out.println("O veículo está se movendo.");
    }
}

class Moto extends Veiculo implements Impressora{
    void empinar(){
        System.out.println("A moto está empinando em uma roda!");
    }

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimindo: " + texto);
    }
}

public class Principal7{
    public static void main(String[] args){
        Moto moto = new Moto();

        moto.mover();
        moto.empinar();
        moto.imprimir("Relatório da moto");
    }
}