interface Impressora{
    void imprimir(String texto);
}

class Cadastro{
    void cadastro(String nome){
        System.out.println("Usuário cadastrado:" + nome);
    }
}

class CadastroUsuario extends Cadastro implements Impressora{
    void mostrarIdade(int idade){
        System.out.println("Idade:" + idade);
    }

    @Override
    public void imprimir(String texto){
        System.out.println("Imprimindo:" + texto);
    }
}

public class Principal10{
    public static void main(String[] args){
        CadastroUsuario usuario = new CadastroUsuario();

        usuario.cadastro("Carlos");
        usuario.mostrarIdade(22);
        usuario.imprimir("Cadastro realizado com sucesso");
    }
}