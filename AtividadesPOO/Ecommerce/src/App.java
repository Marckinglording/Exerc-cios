package AtividadesPOO.Ecommerce.src;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nCADASTRO DE PRODUTOS\n");

        System.out.println("Escolha o tipo de produto: ");

        System.out.println("1- Produto Físico");
        System.out.println("2- Produto Digital");
        System.out.println("3- Assinatura");

        int tipoProduto = scan.nextInt();
        scan.nextLine();

        switch (tipoProduto) {

            case 1:
                
        }

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Preço: ");
        double preco = scan.nextDouble();
        scan.nextLine();

        System.out.println("Peso: ");
        double peso = scan.nextDouble();
        scan.nextLine();

    }
}
