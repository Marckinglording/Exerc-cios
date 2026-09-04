import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] usuarios = {"Marcos Ferreira de Lima", "Lucas Ferreira de Lima"};
        String[] contas = {"71027633102", "71035602180"};
        String[] senhas = {"182001", "190888"};
        String[] operacoes = {"Ver saldo", "Sacar", "Depositar", "Sair"};
        double[] saldos = {1970, 890};
        
        String entrada_conta;
        String entrada_senha;

        int entrada_operacao;
        int nova_operacao;
        double saque;
        double deposito;

        int contador_contas = 0;

        boolean encontrado = false;

        System.out.println("\nACESSE SUA CONTA");
        
        while(true){

            System.out.println("\nDigite seu CPF: ");
            entrada_conta = scan.nextLine();

            for (int i = 0; i < contas.length; i++){

                if(entrada_conta.equals(contas[i])){
                    contador_contas = i;
                    encontrado = true;
                    break;              
                }

            }

            if(encontrado == true){
                System.out.println("\nUsuário encontrado!\n");
                break;
            }else{
                System.out.println("\nUsuário não encontrado!\n");
            }

        }

        while (true) { 
            
            System.out.println("\nDigite sua senha: ");
            entrada_senha = scan.nextLine();

            if(entrada_senha.equals(senhas[contador_contas])){
                System.out.println("\nSenha validada!");

                break;              
            }else{
                System.out.println("\nSenha incorreta. Tente novamente!");
            }

        }

        if(encontrado == true){
            System.out.println("\nBem vindo ao SEUBank " + usuarios[contador_contas] + "\n");
        }

        while (true) {

            System.out.println("Realize uma operação:\n");
            System.out.println("1- " + operacoes[0]);
            System.out.println("2- " + operacoes[1]);
            System.out.println("3- " + operacoes[2]);
            System.out.println("4- " + operacoes[3] + "\n");

            if(scan.hasNextInt()){
                entrada_operacao = scan.nextInt();

                if(entrada_operacao >= 1 && entrada_operacao <= operacoes.length){

                    if(entrada_operacao == 1){

                        System.out.println("\nSeu saldo é de: " + saldos[contador_contas]);
                        
                        //realizar nova operação

                        System.out.println("\nDeseja realizar uma nova operação?");
                        System.out.println("1- Sim");
                        System.out.println("0- Não\n");

                        if(scan.hasNextInt()){
                            nova_operacao = scan.nextInt();

                            if(nova_operacao >= 0 && nova_operacao <= 1){
                                if(nova_operacao == 1){
                                    continue;
                                }
                                if(nova_operacao == 0){
                                    System.out.println("\nAté a próxima!\n");
                                    break;
                                }
                            }else{
                                System.out.println("Entrada inválida! \nDigite um número correspondente à uma das opções.");
                            }

                        }System.out.println("Entrada inválida! \nDigite apenas números.");

                        //realizar nova operação

                    }

                    if(entrada_operacao == 2){
                        
                        System.out.println("Digite o valor do saque: ");
                        saque = scan.nextDouble();

                        if(saque <= saldos[contador_contas]){
                            System.out.println("\nSaque autorizado!");
                            saldos[contador_contas] = saldos[contador_contas] - saque;
                        }else{
                            System.out.println("\nSaque negado!");
                            System.out.println("\nSaldo insuficiente");
                        }
                        
                        //realizar nova operação

                        System.out.println("\nDeseja realizar uma nova operação?");
                        System.out.println("1- Sim");
                        System.out.println("0- Não\n");

                        if(scan.hasNextInt()){
                            nova_operacao = scan.nextInt();

                            if(nova_operacao >= 0 && nova_operacao <= 1){
                                if(nova_operacao == 1){
                                    continue;
                                }
                                if(nova_operacao == 0){
                                    System.out.println("\nAté a próxima!\n");
                                    break;
                                }
                            }else{
                                System.out.println("Entrada inválida! \nDigite um número correspondente à uma das opções.");
                            }

                        }System.out.println("Entrada inválida! \nDigite apenas números.");

                        //realizar nova operação

                    }

                    if(entrada_operacao == 3){
                        
                        System.out.println("Digite o valor do depósito: ");

                        if(scan.hasNextDouble()){
                            deposito = scan.nextDouble();
                            saldos[contador_contas] = saldos[contador_contas] + deposito;
                             System.out.println("\nDepósito realizado com sucesso");
                        }else{
                            System.out.println("\nDepósito não recebido");
                        }
                        
                        //realizar nova operação

                        System.out.println("\nDeseja realizar uma nova operação?");
                        System.out.println("1- Sim");
                        System.out.println("0- Não\n");

                        if(scan.hasNextInt()){
                            nova_operacao = scan.nextInt();

                            if(nova_operacao >= 0 && nova_operacao <= 1){
                                if(nova_operacao == 1){
                                    continue;
                                }
                                if(nova_operacao == 0){
                                    System.out.println("\nAté a próxima!\n");
                                    break;
                                }
                            }else{
                                System.out.println("Entrada inválida! \nDigite um número correspondente à uma das opções.");
                            }

                        }System.out.println("Entrada inválida! \nDigite apenas números.");

                        //realizar nova operação

                    }

                    if(entrada_operacao == 4){
                        System.out.println("\nAté a próxima!\n");
                        break;
                    }

                }else{
                    System.out.println("Entrada inválida! \nDigite um número correspondente à uma das operações.");
                }

            }else{
                System.out.println("Entrada inválida! \nDigite apenas números.");
            }

        }

    }

}
