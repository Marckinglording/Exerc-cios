import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usuario;
        String senha;
        String confirma_usuario;
        String confirma_senha;
        String testa_usuario;
        String testa_senha;
        int contador = 0, restam = 2, chance = 2;

        System.out.println("\nCADASTRO\n");

        externo:
        while (true) { 

            System.out.println("Cadastre o usuário:");
            usuario = scan.nextLine();
            System.out.println("\nConfirme o usuário:");
            confirma_usuario = scan.nextLine();

            if(usuario.equals(confirma_usuario)){
                System.out.println("\nUsuário cadastrado\n");
            }else{
                System.out.println("\nConfirmação falhou, tente novamente!\n");
                continue;
            }

            System.out.println("Cadastre a senha:");
            senha = scan.nextLine();
            System.out.println("\nConfirme a senha:");
            confirma_senha = scan.nextLine();

            if(senha.equals(confirma_senha)){
                System.out.println("\nSenha cadastrada");
                break;
            }else{
                System.out.println("\nConfirmação falhou, tente novamente!\n");

                while (true) {

                    System.out.println("Cadastre a senha:");
                    senha = scan.nextLine();
                    System.out.println("\nConfirme a senha:");
                    confirma_senha = scan.nextLine();

                    if(senha.equals(confirma_senha)){
                        System.out.println("\nSenha cadastrada");
                        break externo;
                    }else{
                        System.out.println("\nConfirmação falhou, tente novamente!\n");
                    }

                }
            }
        }

        System.out.println("\nLOGIN");

        System.out.println("\nDigite o usuário: ");
        testa_usuario = scan.nextLine();

        System.out.println("\nDigite a senha: ");
        testa_senha = scan.nextLine();

        while(contador < chance) {

            if((testa_usuario.equals(usuario)) && testa_senha.equals(senha)){
                System.out.println("\nAcesso concedido\n");
                break;
            }

            else{
                System.out.println("\nTente novamente (Restam " + restam + " tentativas)");

                System.out.println("\nDigite o usuário: ");
                testa_usuario = scan.nextLine();

                System.out.println("\nDigite a senha: ");
                testa_senha = scan.nextLine();
            }

            contador++;
            restam--;

        }

        if(restam == 0) {
            System.out.println("\nAcesso negado\n");
        }

        /*for (int i = 0; i < contador; i++) {

        if((testa_usuario.equals(usuario)) && testa_senha.equals(senha)){
            System.out.println("\nAcesso concedido\n");
            break;
        }

        else{

            System.out.println("\nTente novamente (Restam " + restam + " tentativas)");

            System.out.println("\nDigite o usuário: ");
            testa_usuario = scan.nextLine();

            System.out.println("\nDigite a senha: ");
            testa_senha = scan.nextLine();
        }

        restam--;
        
    }

    if(restam == 0) {
        System.out.println("\nAcesso negado\n");
    }*/

    }

}