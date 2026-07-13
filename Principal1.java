interface Pagamento{
    void pagar(double valor);
}

class Cartao implements Pagamento{

    
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$"+ valor + "realizado no cartão.");
    }
}

public class Principal1{
    public static void main(String[] args){
        Cartao c= new Cartao();

        c.pagar(150.00);
    }
}