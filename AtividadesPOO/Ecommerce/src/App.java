package AtividadesPOO.Ecommerce.src;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Carrinho carrinhoDeCompras = new Carrinho();
        int tipoProduto = 0;

        System.out.println("\nCADASTRO DE PRODUTOS");

        while(true) {

            while (true) {
            
                System.out.println("\nEscolha o tipo de produto: \n");

                System.out.println("1- Produto Físico");
                System.out.println("2- Produto Digital");
                System.out.println("3- Assinatura\n");

                if(scan.hasNextInt()) {

                    int escolha = scan.nextInt();

                    if(escolha > 0 && escolha < 4) {
                        tipoProduto = escolha;
                        scan.nextLine();
                        break;
                    }else {
                        System.out.println("Entrada inválida! \nDigite um número correspondente à uma das opções.");
                        continue;
                    }

                }else {
                    System.out.println("Entrada inválida! \nDigite apenas números.");
                    scan.nextLine();
                }

            }
                
            System.out.println("\nNome:");
            String nome = scan.nextLine();

            System.out.println("\nPreço:");
            double preco = scan.nextDouble();
            scan.nextLine();

            System.out.println("\nPeso:");
            double peso = scan.nextDouble();
            scan.nextLine();

            Produto novoProduto = null;

            switch (tipoProduto) {

                case 1:
                    novoProduto = new ProdutoFisico(nome, preco, peso);
                    break;

                case 2:
                    novoProduto = new ProdutoDigital(nome, preco, peso);
                    break;
                    
                case 3:
                    novoProduto = new Assinatura(nome, preco, peso);
                    break;

                default:
                    System.out.println("Erro ao adicionar produto");
                    break;

                }

            carrinhoDeCompras.adicionarProduto(novoProduto);
            System.out.println("\nO total do seu carrinho é de: " + carrinhoDeCompras.calcularTotal());

            System.out.println("\nDeseja adicionar outro produto?");
            System.out.println("1- Sim");
            System.out.println("2- Não");

            if(scan.hasNextInt()) {

                int escolha = scan.nextInt();

                if(escolha > 0 && escolha < 3) {
                        
                    scan.nextLine();

                    if (escolha == 1) {
                        continue;
                    }
                    if (escolha == 2) {
                        break;
                    }

                }else {
                    System.out.println("Entrada inválida! \nDigite um número correspondente à uma das opções.");
                    continue;
                }

            }else {
                System.out.println("Entrada inválida! \nDigite apenas números.");
                scan.nextLine();
            }

        }

    }
}
