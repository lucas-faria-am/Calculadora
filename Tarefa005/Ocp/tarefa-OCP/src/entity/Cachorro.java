package entity;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("O Cachorro " + nome + " está falando: au au au ");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo");
    }
}