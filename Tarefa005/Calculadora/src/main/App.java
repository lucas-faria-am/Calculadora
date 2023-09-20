package main;

import java.util.Scanner;

import uteis.Calculadora;
import uteis.ErroTratativas;
import uteis.Menu;
import uteis.Multiplicacao;



public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;

        while (opcao != 5) {

            menu.mostrarMenu();
                       
            System.out.println("\nDigite uma opção: ");
            opcao = leitor.nextInt();
            

            switch (opcao) {
                case 1:
                    executarOperacao(leitor, "soma");
                    break;
                case 2:
                    executarOperacao(leitor, "subtracao");
                    break;
                case 3:
                    executarOperacao(leitor, "multiplicacao");
                    break;
                case 4:
                    executarOperacao(leitor, "divisao");
                    break;
                case 5:
                    System.out.println("Programa encerrado\n");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }


    private static void executarOperacao(Scanner leitor, String operacao) {
            System.out.println("\nEscolher números: ");
            System.out.println("\nDigite o primeiro número: ");
            double num1 = leitor.nextDouble();
    
            System.out.println("\nDigite o segundo número: ");
            double num2 = leitor.nextDouble();
        

            Calculadora calculadora = new Calculadora(num1, num2); 
            Multiplicacao newopera = new Multiplicacao(num1, num2);  
        
            switch (operacao) {
                case "soma":
                    System.out.println("\nSoma: " + calculadora.somar());
                    break;
                case "subtracao":
                    System.out.println("\nSubtração: " + calculadora.subtrair());
                    break;
                case "multiplicacao":
                    System.out.println("\nMultiplicação: " + newopera.multiplicar());
                    break;
                case "divisao":
                    try {
                        System.out.println("\nDivisão: " + calculadora.dividir());
                    } catch (ArithmeticException e) {
                        ErroTratativas.tratarErro(e);
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
        }
}


