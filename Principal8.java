Java
// Classe Mãe
class Veiculo {
    void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

// Classe Filha (herda de Veiculo)
class Moto extends Veiculo {
    void empinar() {
        System.out.println("A moto está empinando em uma roda!");
    }
}
