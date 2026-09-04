import java.util.Random;
import java.util.Scanner;

public class Velha {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int modo = 0;
        int escolha_modo, maquina, escolha_jogada, jogada;
        boolean[] contador = new boolean[9];
        boolean jogador_atual = true;
        String jogador1 = "";
        String jogador2 = "";
        String[] posicoes = {"___|", "___", "|___", "___|", "___", "|___","   |", "   ", "|",};
        String[] guia = {"1|", "2", "|3", "4|", "5", "|6","7|", "8", "|9",};

        System.out.println("\nJOGO DA VELHA\n");

        System.out.println("\n___|___|___");
        System.out.println("___|___|___");
        System.out.println("   |   |\n");

        System.out.println("\nEscolha o modo de jogo:\n");
        System.out.println("\n1- Jogador x máquina \n2- Jogador 1 x jogador 2\n");
        
        while (true) { 
            
            if(scan.hasNextInt()){
                escolha_modo = scan.nextInt();
                scan.nextLine();
        
                if(escolha_modo >= 1 && escolha_modo <= 2){
                    modo = escolha_modo;
                    break;
                }else {
                    System.out.println("\nNúmero inválido! \nDigite um número correspondente a um dos modos:");
                }

            }else {
                System.out.println("\nEntrada inválida! \nEscolha digitando o número correspondente a um dos modos:");
                scan.next();
            }

        }

        System.out.println("\nCADASTRO DOS JOGADORES\n");    

        if(modo == 1){
            System.out.println("Jogador:");
            jogador1 = scan.nextLine(); 
        }

        if(modo == 2){
            System.out.println("Jogador1:");
            jogador1 = scan.nextLine(); 
            System.out.println("\nJogador2:");
            jogador2 = scan.nextLine();
        }

        while (true) {

            if(modo == 1){

                System.out.println("\nEscolha sua jogada através do número correspondente à posição desejada\n");

                System.out.println("GUIA\n");
                System.out.println(guia[0] + guia[1] + guia[2]);
                System.out.println(guia[3] + guia[4] + guia[5]);
                System.out.println(guia[6] + guia[7] + guia[8]);

                System.out.println("\n____________\n");

                System.out.println("   JOGO\n");
                System.out.println(posicoes[0] + posicoes[1] + posicoes[2]);
                System.out.println(posicoes[3] + posicoes[4] + posicoes[5]);
                System.out.println(posicoes[6] + posicoes[7] + posicoes[8] + "\n");

                System.out.println("É a vez do " + jogador1);

                while (true) {

                    if(scan.hasNextInt()){
                        escolha_jogada = scan.nextInt();

                        if(escolha_jogada >=1 && escolha_jogada <=9){
                            jogada = escolha_jogada;

                            if(!contador[0]){

                                if(jogada == 1){
                                    posicoes[0] = "_X_|";
                                    contador[0] = true;
                                }

                            }

                            if(!contador[1]){

                                if(jogada == 2){
                                    posicoes[1] = "_X_";
                                    contador[1] = true;
                                }

                            }

                            if(!contador[2]){

                                if(jogada == 3){
                                    posicoes[2] = "|_X_";
                                    contador[2] = true;
                                }

                            }

                            if(!contador[3]){

                                if(jogada == 4){
                                    posicoes[3] = "_X_|";
                                    contador[3] = true;
                                }

                            }

                            if(!contador[4]){

                                if(jogada == 5){
                                    posicoes[4] = "_X_";
                                    contador[4] = true;
                                }

                            }

                            if(!contador[5]){

                                if(jogada == 6){
                                    posicoes[5] = "|_X_";
                                    contador[5] = true;
                                }

                            }

                            if(!contador[6]){

                                if(jogada == 7){
                                    posicoes[6] = " X |";
                                    contador[6] = true;
                                }

                            }

                            if(!contador[7]){

                                if(jogada == 8){
                                    posicoes[7] = " X ";
                                    contador[7] = true;
                                }

                            }

                            if(!contador[8]){

                                if(jogada == 9){
                                    posicoes[8] = "| X";
                                    contador[8] = true;
                                }

                            }

                            while (true) { 

                                maquina = aleatorio.nextInt(9) + 1;

                                if(maquina == 1){

                                    if(!contador[0]){
                                        posicoes[0] = "_O_|";
                                        contador[0] = true;
                                    }
                                    break;
                                }

                                if(maquina == 2){
                                    
                                    if(!contador[1]){
                                        posicoes[1] = "_O_";
                                        contador[1] = true;
                                    }
                                    break;
                                }

                                if(maquina == 3){
                                    
                                    if(!contador[2]){
                                        posicoes[2] = "|_O_";
                                        contador[2] = true;
                                    }
                                    break;
                                }

                                if(maquina == 4){
                                    
                                    if(!contador[3]){
                                        posicoes[3] = "_O_|";
                                        contador[3] = true;
                                    }
                                    break;
                                }

                                if(maquina == 5){
                                    
                                    if(!contador[4]){
                                        posicoes[4] = "_O_";
                                        contador[4] = true;
                                    }
                                    break;
                                }
     
                                if(maquina == 6){
                                    
                                    if(!contador[5]){
                                        posicoes[5] = "|_O_";
                                        contador[5] = true;
                                    }
                                    break;
                                }

                                if(maquina == 7){
                                    
                                    if(!contador[6]){
                                        posicoes[6] = " O |";
                                        contador[6] = true;
                                    }
                                    break;
                                }

                                if(maquina == 8){

                                    if(!contador[7]){
                                        posicoes[7] = " O ";
                                        contador[7] = true;
                                    }
                                    break;
                                }

                                if(maquina == 9){

                                    if(!contador[8]){
                                        posicoes[8] = "| O ";
                                        contador[8] = true;
                                    }
                                    break;
                                }    
                                
                            }        

                            break;

                        }else{
                            System.out.println("Jogada inválida! Escolha um número correspondente à posição desejada");
                        }
                        

                    }else{
                        System.out.println("Jogada inválida! Digite apenas números");
                    }

             
                }

            }

            if(modo == 2){

                System.out.println("\nEscolha sua jogada através do número correspondente à posição desejada\n");

                System.out.println("GUIA\n");
                System.out.println(guia[0] + guia[1] + guia[2]);
                System.out.println(guia[3] + guia[4] + guia[5]);
                System.out.println(guia[6] + guia[7] + guia[8]);

                System.out.println("\n____________\n");

                System.out.println("   JOGO\n");
                System.out.println(posicoes[0] + posicoes[1] + posicoes[2]);
                System.out.println(posicoes[3] + posicoes[4] + posicoes[5]);
                System.out.println(posicoes[6] + posicoes[7] + posicoes[8] + "\n");

                if(jogador_atual){
                    System.out.println("É a vez do " + jogador1);
                }else{
                    System.out.println("É a vez do " + jogador2);
                }
                

                while (true) {

                if(jogador_atual){

                    if(scan.hasNextInt()){
                        escolha_jogada = scan.nextInt();

                        if(escolha_jogada >=1 && escolha_jogada <=9){
                            jogada = escolha_jogada;

                            if(!contador[0]){

                                if(jogada == 1){
                                    posicoes[0] = "_X_|";
                                    contador[0] = true;
                                }

                            }

                            if(!contador[1]){

                                if(jogada == 2){
                                    posicoes[1] = "_X_";
                                    contador[1] = true;
                                }

                            }

                            if(!contador[2]){

                                if(jogada == 3){
                                    posicoes[2] = "|_X_";
                                    contador[2] = true;
                                }

                            }

                            if(!contador[3]){

                                if(jogada == 4){
                                    posicoes[3] = "_X_|";
                                    contador[3] = true;
                                }

                            }

                            if(!contador[4]){

                                if(jogada == 5){
                                    posicoes[4] = "_X_";
                                    contador[4] = true;
                                }

                            }

                            if(!contador[5]){

                                if(jogada == 6){
                                    posicoes[5] = "|_X_";
                                    contador[5] = true;
                                }

                            }

                            if(!contador[6]){

                                if(jogada == 7){
                                    posicoes[6] = " X |";
                                    contador[6] = true;
                                }

                            }

                            if(!contador[7]){

                                if(jogada == 8){
                                    posicoes[7] = " X ";
                                    contador[7] = true;
                                }

                            }

                            if(!contador[8]){

                                if(jogada == 9){
                                    posicoes[8] = "| X";
                                    contador[8] = true;
                                }

                            }

                            while (true) { 

                                maquina = aleatorio.nextInt(9) + 1;

                                if(maquina == 1){

                                    if(!contador[0]){
                                        posicoes[0] = "_O_|";
                                        contador[0] = true;
                                    }
                                    break;
                                }

                                if(maquina == 2){
                                    
                                    if(!contador[1]){
                                        posicoes[1] = "_O_";
                                        contador[1] = true;
                                    }
                                    break;
                                }

                                if(maquina == 3){
                                    
                                    if(!contador[2]){
                                        posicoes[2] = "|_O_";
                                        contador[2] = true;
                                    }
                                    break;
                                }

                                if(maquina == 4){
                                    
                                    if(!contador[3]){
                                        posicoes[3] = "_O_|";
                                        contador[3] = true;
                                    }
                                    break;
                                }

                                if(maquina == 5){
                                    
                                    if(!contador[4]){
                                        posicoes[4] = "_O_";
                                        contador[4] = true;
                                    }
                                    break;
                                }
     
                                if(maquina == 6){
                                    
                                    if(!contador[5]){
                                        posicoes[5] = "|_O_";
                                        contador[5] = true;
                                    }
                                    break;
                                }

                                if(maquina == 7){
                                    
                                    if(!contador[6]){
                                        posicoes[6] = " O |";
                                        contador[6] = true;
                                    }
                                    break;
                                }

                                if(maquina == 8){

                                    if(!contador[7]){
                                        posicoes[7] = " O ";
                                        contador[7] = true;
                                    }
                                    break;
                                }

                                if(maquina == 9){

                                    if(!contador[8]){
                                        posicoes[8] = "| O ";
                                        contador[8] = true;
                                    }
                                    break;
                                }    
                                
                            }        

                            break;

                        }else{
                            System.out.println("Jogada inválida! Escolha um número correspondente à posição desejada");
                        }
                        

                    }else{
                        System.out.println("Jogada inválida! Digite apenas números");
                    }

                }

             
                }

            }

        }

    }
        

        //System.out.println("___|___|___");
        //System.out.println("___|___|___");
        //System.out.println("   |   |");

}
