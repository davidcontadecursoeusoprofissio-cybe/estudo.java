interface Impressora{
    void imprimir(String texto);
}

class Senha{
     void senha (String conta){
        System.out.println("Senha cadastrada:"+ conta );
     }
}

class Email extends Senha implements Impressora{
    void mostradoEmail(String email){
        System.out.println("Email cadastrado:"+ email);

    }


    @Override
    public void imprimir(String texto){
        System.out.println("Imprimindo:"+ texto);
    }
}

public class Principal11{
    public static void main(String[] args){
        Email emailcadastrado = new Email();

        emailcadastrado.senha("236953");
        emailcadastrado.mostradoEmail("davidalarcom@gmail.com");
        emailcadastrado.imprimir("Cadastro realizado");

    }

}