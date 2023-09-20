package app;

import entity.Animal;

public class App {

    public static void main(String[] args) {

        Animal cachorro = new Animal("totó");
        Animal passaro = new Animal("passarinho");

        System.out.println(cachorro.andar());
        System.out.println(cachorro.falar("au au au"));
        System.out.println();
        System.out.println(passaro.andar());
        System.out.println(passaro.falar("piu piu"));

    }
}
