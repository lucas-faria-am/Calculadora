package app;

import entity.Animal;
import entity.Cachorro;
import entity.Passaro;
import entity.Pato;

public class App {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Totó");
        Animal passaro = new Passaro("passarinho");
        Animal pato = new Pato("patinho");

        System.out.println("\n\t\t\tAnimais falando");
        cachorro.falar();
        cachorro.mover();
        System.out.println();

        passaro.falar();
        passaro.mover();
        System.out.println();

        pato.falar();
        pato.mover();
    }
}
