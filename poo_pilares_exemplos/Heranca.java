class Animal {
    void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido");
    }
}

public class Heranca {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
    }
}
