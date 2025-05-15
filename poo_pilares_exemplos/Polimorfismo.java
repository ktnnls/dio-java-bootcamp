class Forma {
    void desenhar() {
        System.out.println("Desenhando forma");
    }
}

class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

class Quadrado extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando quadrado");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Forma forma1 = new Circulo();
        Forma forma2 = new Quadrado();

        forma1.desenhar();
        forma2.desenhar();
    }
}
