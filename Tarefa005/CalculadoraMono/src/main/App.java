package main;
import java.util.Scanner;

import uteis.Calculadora;

public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        double num1, num2;

        while (opcao != 5) {

            System.out.println("\nEscolha uma operação");
            System.out.println("\n 1 - Somar dois números:");
            System.out.println("\n 2 - Subtrair dois números: ");
            System.out.println("\n 3 - Multiplicar dois numeros:");
            System.out.println("\n 4 - Dividir dois numeros:");
            System.out.println("\n 5 - Encerrar progama\n");

            System.out.println("\nDigite uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o primeiro número: ");
                    num1 = leitor.nextDouble();

                    System.out.println("\nDigite o segundo número: ");
                    num2 = leitor.nextDouble();

                    System.out.println("\nSoma: " + calculadora.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("\nDigite o primeiro número: ");
                    num1 = leitor.nextDouble();

                    System.out.println("\nDigite o segundo número: ");
                    num2 = leitor.nextDouble();

                    System.out.println("\nSubtração: " + calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("\nDigite o primeiro número: ");
                    num1 = leitor.nextDouble();

                    System.out.println("\nDigite o segundo número: ");
                    num2 = leitor.nextDouble();

                    System.out.println("\nMultiplicação: " + calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("\nDigite o primeiro número: ");
                        num1 = leitor.nextDouble();

                        System.out.println("\nDigite o segundo número: ");
                        num2 = leitor.nextDouble();

                        System.out.println("\nDivisão: " + calculadora.dividir(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("\n" + e);
                    }
                    break;
                case 5: System.out.println("Programa encerrado\n"); 
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
        leitor.close();

    }
}
