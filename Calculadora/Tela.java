import java.util.Scanner;

public class Tela {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora calc  = new Calculadora();
        
        System.out.println("CALCULADORA");

        System.out.println("Digite o primeiro número: ");
        double a = scan.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scan.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double b = scan.nextDouble();

        switch (operacao) {
            case '+' :
                System.out.println("Resultado: " + calc.somar(a, b));
                break;
            case '-' :
                System.out.println("Resultado: " + calc.subtrair(a, b));
                break;
            case '*' :
                System.out.println("Resultado: " + calc.multiplicar(a, b));
                break;
            case '/' :
                System.out.println("Resultado: " + calc.dividir(a, b));
                break;
            default:
                 System.out.println("Operação inválida!");
        }

        scan.close();
        
    }
}
