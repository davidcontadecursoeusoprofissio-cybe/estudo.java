interface Som {
    void music();
}

class Celular implements Som {
    @Override
    public void music(){
        System.out.println("aumentando volume");
    }
}

public class Principal4{
    public static void main(String[] args)
    {
        Celular celular = new Celular();

        celular.music();
    }
}