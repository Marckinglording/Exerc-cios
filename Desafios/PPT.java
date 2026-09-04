import java.util.Random;
import java.util.Scanner;

public class PPT {
    
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);

        int sistema;
        String escolha;

        System.out.println("\nPEDRA, PAPEL ou TESOURA\n");
        System.out.println("Jogue contra a máquina!");

        while (true) {

            System.out.println("\nDigite \n 'O' para pedra \n 'H' para papel \n ou 'X' para tesoura");
            System.out.println("\nEscolha sua jogada: ");
            escolha = scan.nextLine().toUpperCase();
            sistema = aleatorio.nextInt(3);
            // 0 = Pedra | 1 = Papel | 2 = Tesoura
            // O = Pedra | H = Papel | X = Tesoura
            
            if(escolha.equals("O")){

                if(sistema == 0){
                    System.out.println("\nAmbos escolheram PEDRA. \nJogue de novo!");
                    continue;
                }

                if(sistema == 1){
                    System.out.println("\nVocê escolheu PEDRA e o sistema escolheu PAPEL. \nVocê perdeu!");
                    continue;
                }

                if(sistema == 2){
                    System.out.println("\nVocê escolheu PEDRA e o sistema escolheu TESOURA. \nVocê ganhou!");
                    continue;
                }

                continue;
            }

            if(escolha.equals("H")){
                
                 if(sistema == 0){
                    System.out.println("\nVocê escolheu PAPEL e o sistema escolheu PEDRA. \nVocê ganhou!");
                    continue;
                }

                if(sistema == 1){
                    System.out.println("\nAmbos escolheram PAPEL. \nJogue de novo!");
                    continue;
                }

                if(sistema == 2){
                    System.out.println("\nVocê escolheu PAPEL e o sistema escolheu TESOURA. \nVocê perdeu!");
                    continue;
                }

                continue;
            }

            if(escolha.equals("X")){
                
                 if(sistema == 0){
                    System.out.println("\nVocê escolheu TESOURA e o sistema escolheu PEDRA. \nVocê perdeu!");
                    continue;
                }

                if(sistema == 1){
                    System.out.println("\nVocê escolheu TESOURA e o sistema escolheu PAPEL. \nVocê ganhou!");
                    continue;
                }

                if(sistema == 2){
                    System.out.println("\nAmbos escolheram TESOURA. \nJogue de novo!");
                }
            }

            else{
                System.out.println("\nEntrada inválida. Escolha novamente!\n");
                
            }

        }       

        //Pedra < Papel > Tesoura | Papel < Tesoura > Pedra | Tesoura < Pedra > Papel 

        

    }

}
