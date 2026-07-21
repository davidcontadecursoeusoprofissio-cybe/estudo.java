interface Impressora{
    void imprimir(String texto);
}

class Calculadora{
    void soma(int a, int b){
        System.out.println("Resultado da soma:" + (a+b));
    }
}

class CalculadoraAvancada extends Calculadora implements Impressora{
    void multiplicar(int a, int b){
        System.out.println("Resultado da multiplicação:" + (a*b));
    }

    @Override
    public void imprimir(String texto){
        System.out.println("Imprimindo:" + texto);
    }
}

public class Principal9{
    public static void main(String[] args){
        CalculadoraAvancada calc = new CalculadoraAvancada();

        calc.soma(10,5);
        calc.multiplicar(10,5);
        calc.imprimir("Cálculos finalizados");
    }
}