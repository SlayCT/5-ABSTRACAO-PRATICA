// ===== CLASSES =====

class Celular {
    String marca;
    int bateria;

    void ligar() {
        System.out.println("Celular ligando...");
    }
}

class Carro {
    String marca;
    int velocidade;

    void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}

class Livro {
    String titulo;
    int paginas;

    void ler() {
        System.out.println("Lendo o livro...");
    }
}

class Caneta {
    String cor;
    String tipo;

    void escrever() {
        System.out.println("Escrevendo...");
    }
}

// ===== PRINCIPAL =====

public class Main {
    public static void main(String[] args) {

        // CELULAR
        Celular c1 = new Celular();
        Celular c2 = new Celular();

        c1.marca = "Samsung";
        c2.marca = "Apple";

        System.out.println("Celular 1: " + c1.marca);
        c1.ligar();

        // CARRO
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Toyota";
        carro2.marca = "Honda";

        System.out.println("\nCarro 1: " + carro1.marca);
        carro1.acelerar();

        // LIVRO
        Livro l1 = new Livro();
        Livro l2 = new Livro();

        l1.titulo = "Java Básico";
        l2.titulo = "POO Básico";

        System.out.println("\nLivro 1: " + l1.titulo);
        l1.ler();

        // CANETA
        Caneta can1 = new Caneta();
        Caneta can2 = new Caneta();

        can1.cor = "Azul";
        can2.cor = "Preta";

        System.out.println("\nCaneta 1: " + can1.cor);
        can1.escrever();
    }
}