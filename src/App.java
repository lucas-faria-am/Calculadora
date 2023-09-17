import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        ErroTratativas erroTrat = new ErroTratativas();
        Scanner leitor = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextDouble();
        
        
 
        double soma = calculadora.somar(num1,num2);
        double sub = calculadora.subtrair(num1, num2);
        double multi = calculadora.multiplicar(num1 ,num2);
        double div = calculadora.dividir(num1 ,num2);
    
        

        try {
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + sub);
            System.out.println("Multiplicação: "+ multi);
            System.out.println("Divisão: " + div);

        } catch (ArithmeticException e) {
            erroTrat.tratarErro(e);
        }

        leitor.close();

    }
}
