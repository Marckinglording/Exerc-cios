import java.util.Random;
import java.util.Scanner;

public class Advinhacao {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);

        int palpite, numero;
        int contador = 0, restam = 9, chance = 9;
    
        numero = aleatorio.nextInt(100) + 1;

        System.out.println("\nJOGO DE ADVINHAÇÃO\n");
        System.out.println("Um número aleatório de 1 a 100 foi gerado e você deve advinhá-lo! Você tem 10 tentativas.");

        System.out.println("\nDigite seu palpite:");
        palpite = scan.nextInt();

        while(contador < chance){

            if(palpite == numero){
                System.out.println("\nParabéns, você acertou!\n");
                break;
            }

            if(palpite > numero){
                System.out.println("\nTente um número menor");
                System.out.println("(Restam " + restam + " tentativas)");
            }

            if(palpite < numero){
                System.out.println("\nTente um número maior");
                System.out.println("(Restam " + restam + " tentativas)");
            }

            System.out.println("\nDigite seu próximo palpite:");
            palpite = scan.nextInt();

            restam--;
            contador++;

        }

        if(restam == 0) {
            System.out.println("\nAcabaram as tentativas, você errou!\n");
        }

    }

}