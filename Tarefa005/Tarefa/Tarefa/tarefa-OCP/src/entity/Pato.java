package entity;

public class Pato extends Animal {

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("O pato " + nome + " está falando: quá quá ");
    }

    @Override
    public void mover() {
        System.out.println("O pato está nadando");
    }

}