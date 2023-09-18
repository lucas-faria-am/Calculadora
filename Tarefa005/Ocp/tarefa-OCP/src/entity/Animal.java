package entity;

public abstract class Animal {

    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void falar();

    public abstract void mover();

}
