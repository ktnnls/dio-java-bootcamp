abstract class Veiculo {
    abstract void mover();

    void parar() {
        System.out.println("Veículo parado");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("Carro está se movendo");
    }
}

public class Abstracao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mover();
        carro.parar();
    }
}
