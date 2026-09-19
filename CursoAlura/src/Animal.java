// Classe Animal
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

// Subclasse Cachorro
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}

// Subclasse Gato
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}

// Classe de Teste
public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}