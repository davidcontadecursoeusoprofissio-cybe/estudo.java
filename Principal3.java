interface TV{
    void ligar();
}

class Canal implements TV {

    @Override
    public void ligar(){
        System.out.println("A tv esta abrindo o canal");
    }
}

public class Principal3{
    public static void main(String[] args)
    {
        Canal canal = new Canal();

        canal.ligar();
    }
}