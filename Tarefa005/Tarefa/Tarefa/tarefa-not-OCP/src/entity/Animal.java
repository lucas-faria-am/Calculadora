package entity;

public class Animal {

    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public String  falar(String fala) {
        return "O " + nome + " está falando: " + fala;
    }
    public String andar(){
        return "O " + nome + " está andando ";
    }
}
