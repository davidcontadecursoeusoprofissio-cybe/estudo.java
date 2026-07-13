interface Documentos{
    void textos(String texto);
}


class Escrita implements Documentos{

    @Override
    public void textos(String texto){
        System.out.println("Mensagem:"+ texto);
    }
}

public class Principal5{
    public static void main(String[] args){
        Escrita escrita = new Escrita();

        escrita.textos("Hoje o dia está lindo");
    }
}