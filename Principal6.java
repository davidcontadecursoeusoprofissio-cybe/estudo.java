interface Conta{
    void valor(double valores);
}

class Compra implements Conta{
    @Override
    public void valor(double valores){
        System.out.println("Pagamento de R$:"+ valores + "Compras realizada");

    }
}

public class Principal6{
    public static void main(String[] args){
        Compra compra = new Compra();

        compra.valor(400.50);
    }
}