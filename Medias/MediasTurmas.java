
import java.util.Scanner;

public class MediasTurmas {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in, "UTF-8");

        final int QntTurmas = 2;
        final int QntAlunos = 2;
        final int QntDisciplinas = 3;

        String[] Turmas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};

        String[][] Alunos = new String[QntTurmas][QntAlunos];

        String[] Disciplinas = {"Português", "Matemática", "Ciências", "História"};

        double[][][] Notas = new double[QntTurmas][QntAlunos][QntDisciplinas];
       
        double[][] Medias = new double[QntTurmas][QntAlunos];
        
        double[] MaiorMedia = new double[QntTurmas]; 
        double[] MenorMedia = new double[QntTurmas];
       
        String[] MelhorAluno = new String [QntTurmas]; 
        String[] PiorAluno = new String [QntTurmas];
        
        System.out.println("\n--- CADASTRO DOS ALUNOS ---");

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++) {
            System.out.printf("\nTURMA %s\n", Turmas[ContadorTurmas]);

            for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {
                System.out.print("Digite o nome do(a) aluno(a) " + (ContadorAlunos+1) + ": ");
                Alunos[ContadorTurmas][ContadorAlunos] = Scan.nextLine();
    
        }

        }

        System.out.println("\n--- CADASTRO DE NOTAS ---");

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++){
            System.out.printf("\nTURMA %s\n", Turmas[ContadorTurmas]);


            for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {
                System.out.println("\n Notas do(a) aluno(a): " + Alunos[ContadorTurmas][ContadorAlunos]);
            
                for(int ContadorDisciplinas = 0; ContadorDisciplinas < QntDisciplinas; ContadorDisciplinas++) {

                    double Nota;

                    while(true) { 

                        System.out.println("Digite a nota de " + Disciplinas[ContadorDisciplinas] + " (0 a 10): ");

                        if(Scan.hasNextDouble()) {

                            Nota = Scan.nextDouble();

                            if(Nota >= 0 && Nota <=10){
                            break;

                        } else {

                            System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                            }

                        } else {

                            System.out.println("Entrada inválida! Por favor, digite apenas números.");

                            Scan.next();
                        }
    
                    }

                    Notas[ContadorTurmas][ContadorAlunos][ContadorDisciplinas] = Nota;

                }

            }

        }

        Scan.close();

        //Calculando médias

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++) {
        
            for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {

                double Soma = 0;

                for(int ContadorDisciplinas = 0; ContadorDisciplinas < QntDisciplinas; ContadorDisciplinas++) {
                    Soma += Notas[ContadorTurmas][ContadorAlunos][ContadorDisciplinas];
                }

                Medias[ContadorTurmas][ContadorAlunos] = Soma / QntDisciplinas;

            }
        
        }

        System.out.println("\n--- MÉDIAS E SITUAÇÕES DOS ALUNOS POR TURMA ---");

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++) {
            System.out.printf("\nTURMA %s\n", Turmas[ContadorTurmas]);

            double MaiorMediaAluno = Double.MIN_VALUE, MenorMediaAluno = Double.MAX_VALUE; 

            for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {
                System.out.printf("O(a) Aluno(a) " + Alunos[ContadorTurmas][ContadorAlunos] + " tem média:  %.1f e está " , Medias[ContadorTurmas][ContadorAlunos]);

                if(Medias[ContadorTurmas][ContadorAlunos] >= 7){
                    System.out.println("APROVADO(A)");
                }

                else if(Medias[ContadorTurmas][ContadorAlunos] >= 5){
                    System.out.println("em RECUPERAÇÃO");
                }

                else {
                    System.out.println("REPROVADO(A)");
                }

                if(Medias[ContadorTurmas][ContadorAlunos] > MaiorMediaAluno) {
                    MaiorMediaAluno = Medias[ContadorTurmas][ContadorAlunos];
                    MaiorMedia[ContadorTurmas] = MaiorMediaAluno;
                    MelhorAluno[ContadorTurmas] = Alunos[ContadorTurmas][ContadorAlunos];
                }

                if(Medias[ContadorTurmas][ContadorAlunos] < MenorMediaAluno) {
                    MenorMediaAluno = Medias[ContadorTurmas][ContadorAlunos];
                    MenorMedia[ContadorTurmas] = MenorMediaAluno;
                    PiorAluno[ContadorTurmas] = Alunos[ContadorTurmas][ContadorAlunos];
                }

            }
        
        }     

        System.out.println("\n--- MAIOR E MENOR MÉDIA DOS ALUNOS POR TURMA ---");

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++) {
            System.out.printf("\nTURMA %s\n", Turmas[ContadorTurmas]);

        System.out.println("\nO(a) aluno(a) com maior média é o(a) " + MelhorAluno[ContadorTurmas] + " com média " + MaiorMedia[ContadorTurmas]);

        System.out.println("\nO(a) aluno(a) com menor média é o(a) " + PiorAluno[ContadorTurmas] + " com média " + MenorMedia[ContadorTurmas]);

        }

        /*System.out.println("\n--- MÉDIA DAS TURMAS E APROVAÇÃO PERCENTUAL POR DISCIPLINA ---");

        int Turma = 0;

        while(Turma < QntTurmas){

            int Disciplina = 0;

            while(Disciplina < QntDisciplinas) {

                double Soma = 0, Maior = Double.MIN_VALUE, Menor = Double.MAX_VALUE;

                int Aluno = 0, AprovadosPercent = 0;

                while(Aluno < QntAlunos) {

                    double Nota = Notas[Turma][Aluno][Disciplina];

                    Soma += Nota;

                    if(Notas[Turma][Aluno][Disciplina] >= 7){

                        AprovadosPercent++;
                    }

                    if(Nota > Maior) {

                        Maior = Nota;
                    }

                    if(Nota < Menor) {

                        Menor = Nota;
                    }

                    Aluno++;

                    Disciplina++;


                }

                double Media = Soma / QntAlunos;

                double Porcentagem = (AprovadosPercent / (double) QntAlunos) * 100;


                System.out.println("\nTurma: " + Turmas[Turma]);

                System.out.println("\nDisciplina: " + Disciplinas[Disciplina]);

                System.out.printf("\nMedia da turma: %.1f\n", Media);

                System.out.println("Maior nota: " + Maior);

                System.out.println("Menor nota: " + Menor);

                System.out.printf("\nPercentual de aprovação: %.1f%%\n", Porcentagem);
                
            }

            Turma++;

        }*/

        System.out.println("\n--- MÉDIA DAS TURMAS E APROVAÇÃO PERCENTUAL POR DISCIPLINA ---");

        for(int ContadorTurmas = 0; ContadorTurmas < QntTurmas; ContadorTurmas++) {
            System.out.println("\nTurma: " + Turmas[ContadorTurmas]);

            double SomaDisc, MediasDisc;

            for(int ContadorDisciplinas = 0; ContadorDisciplinas < QntDisciplinas; ContadorDisciplinas++) {
                System.out.println("\nDisciplina: " + Disciplinas[ContadorDisciplinas]);

                SomaDisc = 0;

                int AprovadosPercent = 0;
                double Maior = Double.MIN_VALUE, Menor = Double.MAX_VALUE;

                for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {

                    SomaDisc += Notas[ContadorTurmas][ContadorAlunos][ContadorDisciplinas];

                    double Nota = Notas[ContadorTurmas][ContadorAlunos][ContadorDisciplinas];

                    if(Nota >= 7){

                        AprovadosPercent++;
                    }

                    if(Nota > Maior) {

                        Maior = Nota;
                    }

                    if(Nota < Menor) {

                        Menor = Nota;
                    }

                }

                MediasDisc = SomaDisc / QntAlunos;

                double Porcentagem = (AprovadosPercent / (double) QntAlunos) * 100;

                System.out.printf("\nMedia da turma: %.1f\n", MediasDisc);

                System.out.printf("\nMaior nota: %.1f\n", Maior);

                System.out.printf("\nMenor nota: %.1f\n", Menor);

                System.out.printf("\nPercentual de aprovação: %.1f\n", Porcentagem);

            }
        }

        /*System.out.println("\n--- ALUNOS EXCELENTES ---");

        int AlunosEX = 0;

        int Excelentes = 0;

        do {

            if(Medias[AlunosEX] >= 8) {

                System.out.println("O aluno: " + Alunos[AlunosEX] + " tem a excelente média de: " + Medias[AlunosEX]);

                Excelentes++;

            }

            AlunosEX++;
            
        } while (AlunosEX < QntAlunos);

        System.out.println("Na turma há " + Excelentes + " alunos excelentes.");

        System.out.println("\n--- BOLETIM DO MELHOR ALUNO ---");

        System.out.println("\nO aluno com maior média é: " + Alunos[MelhorAluno]);

        System.out.println("\nBOLETIM: \n");

        for(int ContadorDisciplinas = 0; ContadorDisciplinas < QntDisciplinas; ContadorDisciplinas++) {

        double Nota = Notas[MelhorAluno][ContadorDisciplinas];

        String NotaConceito = "F"; 

        if(Nota >= 9) {
            NotaConceito = "A";
        }

        else if(Nota >= 8) {
            NotaConceito = "B";
        }

        else if(Nota >= 7) {
            NotaConceito = "C";
        }

        else if(Nota >= 5) {
            NotaConceito = "D";
        }

        else if(Nota < 5) {
            NotaConceito = "F";
        }

        System.out.println(Disciplinas[ContadorDisciplinas]);

        System.out.println(NotaConceito);

        System.out.println();

        }

        System.out.println("\n--- HISTOGRAMA DE MÉDIAS DOS ALUNOS --- \n");

        int[] MediasEmFaixas = new int[5];

        for(int ContadorAlunos = 0; ContadorAlunos < QntAlunos; ContadorAlunos++) {

            if(Medias[ContadorAlunos] < 3) {
            MediasEmFaixas[0]++;
            }
            else if(Medias[ContadorAlunos] < 5) {
            MediasEmFaixas[1]++;
            }
            else if(Medias[ContadorAlunos] < 7) {
            MediasEmFaixas[2]++;
            }
            else if(Medias[ContadorAlunos] < 9) {
            MediasEmFaixas[3]++;
            }
            else if(Medias[ContadorAlunos] >= 9) {
            MediasEmFaixas[4]++;
            }
        }

        String[] NomesFaixas = {"0-2.9", "3-4.9", "5-6.9", "7-8.9", "9-10"};

        int Faixas = 0;

        while(Faixas < 5) {

            System.out.print(NomesFaixas[Faixas] + " | ");

            for(int ContadorDisciplinas = 0; ContadorDisciplinas < MediasEmFaixas[Faixas]; ContadorDisciplinas++) {

            System.out.print("*");

            }

            System.out.println();

            Faixas++;

        }

        Scan.close(); */

    }
    
}