package uteis;

public class Calculadora {

    private double num1;
    private double num2;
   
    public Calculadora () {

    }

    public Calculadora (Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1 () {
        return num1;
    }

    public double getNum2 () {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }


    public double somar() {
       return  this.num1 + this.num2;
    }
    
    public double subtrair() {
        return  this.num1 - this.num2;
    }

    public double dividir() {
        if(this.num2 == 0) {
            throw new ArithmeticException("Erro: Não é possivel dividir por zero!");
        }
        return  this.num1 / this.num2;
    }
}