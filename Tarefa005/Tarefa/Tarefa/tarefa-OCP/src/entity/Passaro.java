package entity;

public class Passaro extends Animal {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("O passaro " + nome + " está falando: piu piu");
    }

    @Override
    public void mover() {
        System.out.println("O passaro está voando");
    }
}
