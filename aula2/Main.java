package aula2;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA = 2.0;
        calc.numB = 3.0;
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("Multiplicar: " + calc.multiplicar());
        System.out.println("Dividir: " + calc.dividir());
    }

}
