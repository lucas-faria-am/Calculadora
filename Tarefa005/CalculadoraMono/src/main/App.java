package main;
import java.util.Scanner;

import Uteis.Calculadora;


public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        
        Scanner leitor = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: \n");
        num2 = leitor.nextDouble();
        
    try {        
        System.out.println("Soma: " + calculadora.somar(num1,num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: "+ calculadora.multiplicar(num1 ,num2));
        System.out.println("Divisão: " + calculadora.dividir(num1 ,num2));
    } catch (Exception e) {
      System.out.println("\n" + e);
    }

        leitor.close();

    }
}
