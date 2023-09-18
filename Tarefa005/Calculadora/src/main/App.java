package main;
import java.util.Scanner;

import uteis.Calculadora;
import uteis.ErroTratativas;
import uteis.Menu;




public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        ErroTratativas erroTrat = new ErroTratativas();
        Scanner leitor = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;

        double num1, num2;

        while (opcao != 5) {

            menu.mostrarMenu();

            System.out.println("\nDigite uma opção: ");
            opcao = leitor.nextInt();

            if (opcao == 5) {
                break;
            }

            System.out.println("\nDigite o primeiro número: ");
            num1 = leitor.nextDouble();
    
            System.out.println("\nDigite o segundo número: ");
            num2 = leitor.nextDouble();   

            switch(opcao) {
                case 1:
                   System.out.println("\nSoma: " + calculadora.somar(num1,num2));
                   break;
                case 2:
                   System.out.println("\nSubtração: " + calculadora.subtrair(num1, num2));
                   break;
                case 3:
                   System.out.println("\nMultiplicação: "+ calculadora.multiplicar(num1 ,num2));
                   break;
                case 4:
                    try {
                        System.out.println("\nDivisão: " + calculadora.dividir(num1 ,num2));
                    } catch (ArithmeticException e) {
                        erroTrat.tratarErro(e);
                    }
                    break;
                 default: System.out.println("Opcao invalida!");           
            }
        }
        leitor.close();                   
    }
}
