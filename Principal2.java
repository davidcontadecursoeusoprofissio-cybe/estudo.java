interface Veiculo{
    void ligar();
}

class Carro implements Veiculo{

    @Override
    public void ligar(){
        System.out.println("O carro foi ligado.");
    }
}

public class Principal2{
    public static void main(String[] args){
        Carro carro = new Carro();

        carro.ligar();
    }    
}