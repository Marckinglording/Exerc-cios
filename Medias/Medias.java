
import java.util.Scanner;

public class Medias {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in, "UTF-8");
        //SCANNER LÊ DADOS DE ENTRADA DO TECLADO

        String[] Alunos = new String[10];
        //VETOR DO TIPO TEXTO QUE GUARDA OS NOMES DOS ALUNOS

        double[][] Notas = new double[10][4];
        //MATRIZ DO TIPO NUMÉRICO (COM DECIMAIS) QUE GUARDA AS NOTAS DOS ALUNOS

        String [] Disciplinas = {"Português", "Matemática", "Ciências", "História"};
        //VETOR DO TIPO TEXTO QUE GUARDA AS DISCIPLINAS ÀS QUAIS AS NOTAS SE REFEREM

        double[] Medias = new double[10];
        //VETOR DO TIPO NUMÉRICO QUE GUARDA AS MÉDIAS INDIVIDUAIS DE CADA ALUNO

        double MaiorMedia = Medias[0];
        //VARIÁVEL QUE GUARDARÁ A MAIOR MÉDIA DO VETOR MÉDIAS E INICIA COM A PRIMEIRA POSIÇÃO DO VETOR MÉDIAS

        double MenorMedia = Double.MAX_VALUE;
        //VARIÁVEL QUE GUARDARÁ A MENOR MÉDIA DO VETOR MÉDIAS E INICIA COM VALOR 10

        int MelhorAluno = 0;
        //VARIÁVEL QUE GUARDARÁ O ALUNO COM MAIOR MÉDIA

        int PiorAluno = 0;
        //VARIÁVEL QUE GUARDARÁ O ALUNO COM MENOR MÉDIA

        
        System.out.println("\n--- CADASTRO DOS ALUNOS ---");
        //IMPRIMINDO UM "TÍTULO"

        for(int ContadorAlunos = 0; ContadorAlunos < 10; ContadorAlunos++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS
            System.out.print("Digite o nome do(a) aluno(a) " + (ContadorAlunos+1) + ": ");
            Alunos[ContadorAlunos] = Scan.nextLine();
            //ATRIBUINDO O VALOR DE UMA LINHA DE TEXTO DIGITADA PELO USUÁRIO AO VETOR ALUNOS NA POSIÇÃO ATUAL EXPRESSADA PELO CONTADOR DE ALUNOS
    
        }

        System.out.println("\n--- CADASTRO DE NOTAS ---");
        //IMPRIMINDO UM "TÍTULO"
        
        for(int ContadorAlunos = 0; ContadorAlunos < 10; ContadorAlunos++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS
            System.out.println("\n Notas do(a) aluno(a): " + Alunos[ContadorAlunos]);
            //IMRIMINDO O NOME DO ALUNO LOCALIZADO NA POSIÇÃO ATUAL DO CONTADOR
            
            for(int ContadorDisciplinas = 0; ContadorDisciplinas < 4; ContadorDisciplinas++) {
            //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM DISCIPLINAS

                double Nota;
                //VARIÁVEL QUE RECEBERÁ A NOTA DIGITADA PARA VALIDAÇÃO DE ENTRADA

                while(true) { 
                //CRIA UM LOOP INFINITO (CONDIÇÃO SEMPRE VERDADEIRA)

                    System.out.println("Digite a nota de " + Disciplinas[ContadorDisciplinas] + " (0 a 10): ");
                     //IMRIMINDO O NOME DA DISCIPLINA LOCALIZADA NA POSIÇÃO ATUAL DO CONTADOR

                    if(Scan.hasNextDouble()) {
                    //VERIFICA A ENTRADA DEFININDO SE A NOTA DIGITADA SE TRATA DE UM NÚMERO  

                        Nota = Scan.nextDouble();
                        //ATRIBUI O VALOR DE UMA LINHA DE TEXTO DIGITADA PELO USUÁRIO À POSIÇÃO ATUAL DO CONTADOR DE DISCIPLINAS

                        if(Nota >= 0 && Nota <=10){
                        //VERIFICA A ENTRADA DEFININDO SE O NÚMERO DIGITADO ESTÁ DENTRO DOS PARÂMETROS DE LANÇAMENTO
                            break;
                            //INTERROMPE A EXECUÇÃO DO LOOP

                        } else {
                        //SE NÃO ENCONTRADA A CONDIÇÃO TESTADA ACIMA

                            System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                            //REJEITA A ENTRADA E MOSTRA CÓDIGO DE ERRO PEDINDO REDIGITAÇÃO
                        }

                    } else {
                    //SE NÃO ENCONTRADA A CONDIÇÃO TESTADA ACIMA

                        System.out.println("Entrada inválida! Por favor, digite apenas números.");
                        //REJEITA A ENTRADA E MOSTRA CÓDIGO DE ERRO PEDINDO REDIGITAÇÃO

                        Scan.next();
                        //DESCARTA O VALOR DIGITADO E RECEBE UM NOVO
                    }
    
                }

                Notas[ContadorAlunos][ContadorDisciplinas] = Nota;
                //ATRIBUI A NOTA DIGITADA E VALIDA A ENTRADA

            }

        }

        System.out.println("\n--- MÉDIAS E SITUAÇÕES DOS ALUNOS ---");
        //IMPRIMINDO UM "TÍTULO"

        for(int ContadorAlunos = 0; ContadorAlunos < 10; ContadorAlunos++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS

            double Soma = 0;
            //VARIÁVEL QUE DEIFINE O VALOR INICIAL DE SOMA, USADO PARA SOMAR AS NOTAS DE CADA ALUNO, COMO 0(ZERO)

            for(int ContadorDisciplinas = 0; ContadorDisciplinas < 4; ContadorDisciplinas++) {
                //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM DISCIPLINAS
                Soma += Notas[ContadorAlunos][ContadorDisciplinas];
                //SOMA OS VALORES ATRIBUÍDOS ÀS NOTAS PELO USUÁRIO À VARIÁVEL SOMA
            }

            Medias[ContadorAlunos] = Soma / 4;
            //CALCULA A MÉDIA DAS 4 NOTAS ATRIBUÍDAS À POSIÇÃO ATUAL DO CONTADOR DE ALUNOS

        }

        for(int ContadorAlunos = 0; ContadorAlunos < 10; ContadorAlunos++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS    
            System.out.print("O(a) Aluno(a) " + Alunos[ContadorAlunos] + " tem média: " + Medias[ContadorAlunos] + " e está ");
            //IMPRIME A MÉDIA E A SITUAÇÃO DOS ALUNOS
            
            if(Medias[ContadorAlunos] >= 7){
                System.out.println("APROVADO(A)");
                //DEFINE QUE SE A NOTA DO ALUNO FOR MAIOR OU IGUAL À 7 A SITUAÇÃO DO MESMO É 'APROVADO'
            }

            else if(Medias[ContadorAlunos] >= 5){
                System.out.println("em RECUPERAÇÃO");
                //DEFINE QUE SE A NOTA DO ALUNO, QUE JÁ NÃO É MAIOR OU IGUAL À 7, FOR MAIOR OU IGUAL À 5 A SITUAÇÃO DO MESMO É 'EM RECUPERAÇÃO'
            }

            else {
                System.out.println("REPROVADO(A)");
                //DEFINE QUE SE A NOTA DO ALUNO NÃO FOR MAIOR OU IGUAL À 5 A SITUAÇÃO DO MESMO É 'REPROVADO'
            }

            if(Medias[ContadorAlunos] > MaiorMedia) {
            //VERIFICANDO SE A MÉDIA DO ALUNO ATUAL NO VETOR É MAIOR QUE A MAIOR MÉDIA ATUAL 
            MaiorMedia = Medias[ContadorAlunos];
            //CASO SEJA VERDADEIRO ATRIBUI A MÉDIA DO ALUNO ATUAL À MAIOR MÉDIA (ATUALIZANDO A MAIOR MÉDIA)
            MelhorAluno = ContadorAlunos;
            //CASO SEJA VERDADEIRO TAMBÉM ATRIBUI O ALUNO ATUAL À QUEM PERTENCE A MAIOR MÉDIA À POSIÇÃO DE MELHOR ALUNO (ATUALIZANDO O MELHOR ALUNO)
            }

            if(Medias[ContadorAlunos] < MenorMedia) {
            //VERIFICANDO SE A MÉDIA DO ALUNO ATUAL NO VETOR É MENOR QUE A MENOR MÉDIA ATUAL 
            MenorMedia = Medias[ContadorAlunos];
            //CASO SEJA VERDADEIRO ATRIBUI A MÉDIA DO ALUNO ATUAL À MENOR MÉDIA (ATUALIZANDO A MENOR MÉDIA)
            PiorAluno = ContadorAlunos;
            //CASO SEJA VERDADEIRO TAMBÉM ATRIBUI O ALUNO ATUAL À QUEM PERTENCE A MAIOR MÉDIA À POSIÇÃO DE PIOR ALUNO (ATUALIZANDO O PIOR ALUNO)
            }

        }

        System.out.println("\n--- MAIOR E MENOR MÉDIA DOS ALUNOS ---");
        //IMPRIMINDO UM "TÍTULO"

        System.out.println("\nO(a) aluno(a) com maior média é o(a) " + Alunos[MelhorAluno] + " com média " + MaiorMedia);
        //IMPRIME O ALUNO COM MELHOR MÉDIA

        System.out.println("\nO(a) aluno(a) com menor média é o(a) " + Alunos[PiorAluno] + " com média " + MenorMedia);
        //IMPRIME O ALUNO COM PIOR MÉDIA

        

        System.out.println("\n--- MÉDIA DA TURMA E APROVAÇÃO PERCENTUAL POR DISCIPLINA ---");
        //IMPRIMINDO UM "TÍTULO"

        int Disciplina = 0;
        //VARIÁVEL QUE GUARDARÁ A DISCIPLINA CHECADA NO MOMENTO

        while(Disciplina < 4) {
        //EXECUTA 4 VEZES (UMA VEZ PARA CADA DISCIPLINA)

            double Soma = 0;
            //DEFINE A SOMA DE DISCIPLINAS INICIANDO EM 0(ZERO)

            double Maior = Notas[0][Disciplina];
            //VARIÁVEL A QUAL SERÁ ATRIBUIDA A MAIOR MÉDIA DE CADA DISCIPLINA

            double Menor = Notas[0][Disciplina];
            //VARIÁVEL A QUAL SERÁ ATRIBUIDA A MENOR MÉDIA DE CADA DISCIPLINA

            int Aluno = 0;
            //VARIÁVEL QUE FARÁ A CONTAGEM DE ALUNOS

            int AprovadosPercent = 0;
            //VARIÁVEL QUE FARÁ A CONTAGEM DE QUANTOS ALUNOS FORAM APROVADOS POR CADA DISCIPLINA

            while(Aluno < 10) {
            //EXECUTA 10 VEZES (UMA VEZ PARA CADA ALUNO)

                double Nota = Notas[Aluno][Disciplina];
                //ATRIBUI AS NOTAS DOS VETORES PARA SOMATIZAÇÃO

                Soma += Nota;
                //ADICIONA A NOTA ATRIBUÍDA À SOMA

                if(Notas[Aluno][Disciplina] >= 7){
                //TESTA SE O ALUNO ATUAL FOI APROVADO A PARTIR DA SUA MÉDIA SENDO IGUAL OU MAIOR A 7

                    AprovadosPercent++;
                    //SE VERDADEIRO INCREMENTA 1 À CONTAGEM DE ALUNOS APROVADOS
                }

                if(Nota > Maior) {
                //CHECA SE A NOTA ATUAL É MAIOR QUE A MAIOR NOTA REGISTRADA

                    Maior = Nota;
                    //CASO VERDADEIRO ATUALIZA A MAIOR NOTA ATRIBUINDO O VALOR DA NOTA ATUAL AO REGISTRO DE MAIOR NOTA 
                }

                if(Nota < Menor) {
                //CHECA SE A NOTA ATUAL É MENOR QUE A MENOR NOTA REGISTRADA

                    Menor = Nota;
                    //CASO VERDADEIRO ATUALIZA A MENOR NOTA ATRIBUINDO O VALOR DA NOTA ATUAL AO REGISTRO DE MENOR NOTA 
                }

                Aluno++;
                //ADICIONA 1 AO VALOR DA VARIÁVEL ALUNO ATUALIZANDO PARA A PRÓXIMA POSIÇÃO DO VETOR

            }

            double Media = Soma / 10;
            //ATRIBUI A SOMA DE TODAS AS NOTAS COLETADAS POR DISCIPLINA DIVIDIDAS PELA MESMA QUANTIDADE À VARIÁVEL MEDIA (GUARDA O VALOR DA MÉDIA DAS NOTAS NA VARIÁVEL

            double Porcentagem = (AprovadosPercent / 10.0) * 100;

            String PorcentagemFormatada = String.format("%.1f%%", Porcentagem);

            System.out.println("\nDisciplina: " + Disciplinas[Disciplina]);
            //IMPRIME A DISCIPLINA SOBRE A QUAL SERÁ LISTADA AS INFORMAÇÕES À SEGUIR

            System.out.println("Media da turma: " + Media);
            //IMPRIME A MÉDIA DA TURMA NA DISCIPLINA ENTITULADA

            System.out.println("Maior nota: " + Maior);
            //IMPRIME A MAIOR NOTA DA DISCIPLINA ENTITULADA

            System.out.println("Menor nota: " + Menor);
            //IMPRIME A MENOR NOTA DA DISCIPLINA ENTITULADA

            System.out.println("Percentual de aprovação: " + PorcentagemFormatada);
                
            Disciplina++;
            //ADICIONA 1 AO VALOR DA VARIÁVEL DISCIPLINA ATUALIZANDO PARA A PRÓXIMA POSIÇÃO DO VETOR

        }

        System.out.println("\n--- ALUNOS EXCELENTES ---");
        //IMPRIMINDO UM "TÍTULO"

        int AlunosEX = 0;
        //VARIÁVEL CONTADOR DE ALUNOS QUE JÁ FORAM VERIFICADOS

        int Excelentes = 0;
        //VARIÁVEL CONTADOR DE ALUNOS COM MÉDIA IGUAL OU MAIOR QUE 8, CONSIDERADOS EXCELENTES

        do {
        //CRIA UM LOOP QUE SERÁ TESTADO APENAS NO FIM, FORÇANDO A EXECUÇÃO PELO MENOS UMA VEZ

            if(Medias[AlunosEX] >= 8) {
            //TESTA SE A MÉDIA DE CADA ALUNO É MAIOR OU IGUAL A 8

                System.out.println("O aluno: " + Alunos[AlunosEX] + " tem a excelente média de: " + Medias[AlunosEX]);
                //SE VERDADEIRO IMPRIME A MÉDIA DO ALUNO ENCONTRADO

                Excelentes++;
                //INCREMENTA 1 À CONTAGEM DE ALUNOS EXCELENTES

            }

            AlunosEX++;
            //INCREMENTA 1 À CONTAGEM DE ALUNOS VERIFICADOS
            
        } while (AlunosEX < 10);
        //TESTA O LOOP COM A CONDIÇÃO DE EXECUÇÃO SENDO MENOR QUE 10

        System.out.println("Na turma há " + Excelentes + " alunos excelentes.");
        //IMPRIMINDO UM "SUBTÍTULO" ATRELADO À CONTAGEM DE ALUNOS EXCELENTES

        System.out.println("\n--- BOLETIM DO MELHOR ALUNO ---");
        //IMPRIMINDO UM "TÍTULO"

        System.out.println("\nO aluno com maior média é: " + Alunos[MelhorAluno]);
        //IMRIMINDO UM "SUBTÍTULO"

        System.out.println("\nBOLETIM: \n");
        //IMRIMINDO UM "SUBTÍTULO"

        for(int ContadorDisciplinas = 0; ContadorDisciplinas < 4; ContadorDisciplinas++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS

        double Nota = Notas[MelhorAluno][ContadorDisciplinas];
        //ATRIBUIR A NOTA DE CADA DISCIPLINA DO MELHOR ALUNO PARA CHECAGEM DE CONCEITO

        String NotaConceito = "F"; 
        //VARIÁVEL QUE GUARDA CONCEITO DA NOTA DO ALUNO | INICIANDO EM F

        if(Nota >= 9) {
        //TESTA SE A NOTA DO ALUNO É MAIOR OU IGUAL A 9
            NotaConceito = "A";
            //SE VERDADEIRO ATRIBUI "A" AO CONCEITO DA NOTA
        }

        else if(Nota >= 8) {
        //SE A NOTA DO ALUNO NÃO FOR MAIOR OU IGUAL A 9, TESTA SE É MAIOR OU IGUAL A 8
            NotaConceito = "B";
            //SE VERDADEIRO ATRIBUI "A" AO CONCEITO DA NOTA
        }

        else if(Nota >= 7) {
        //SE A NOTA DO ALUNO NÃO FOR MAIOR OU IGUAL A 9 NEM A 8, TESTA SE É MAIOR OU IGUAL A 7
            NotaConceito = "C";
            //SE VERDADEIRO ATRIBUI "A" AO CONCEITO DA NOTA
        }

        else if(Nota >= 5) {
        //SE A NOTA DO ALUNO NÃO FOR MAIOR OU IGUAL A 9 NEM A 8 E NEM A 7, TESTA SE É MAIOR OU IGUAL A 5
            NotaConceito = "D";
            //SE VERDADEIRO ATRIBUI "A" AO CONCEITO DA NOTA
        }

        else if(Nota < 5) {
        //TESTA SE A NOTA DO ALUNO NÃO É MAIOR OU IGUAL A 9, 8, 7 OU 5 
            NotaConceito = "F";
            //SE VERDADEIRO ATRIBUI "A" AO CONCEITO DA NOTA
        }

        System.out.println(Disciplinas[ContadorDisciplinas]);
        //IMPRIME A DISCIPLINA ENTITULADA

        System.out.println(NotaConceito);
        //IMPRIME O CONCEITO

        System.out.println();
        //ESPAÇO EM BRANCO (SALTAR LINHA)

        }

        System.out.println("\n--- HISTOGRAMA DE MÉDIAS DOS ALUNOS --- \n");
        //IMPRIMINDO UM TÍTULO

        int[] MediasEmFaixas = new int[5];
        //VETOR QUE CONTARÁ AS FAIXAS DE NOTAS

        // Classificando as médias
        for(int ContadorAlunos = 0; ContadorAlunos < 10; ContadorAlunos++) {
        //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM ALUNOS

            if(Medias[ContadorAlunos] < 3) {
            //CHECA SE O VALOR DE MÉDIAS NA POSIÇÃO DO CONTADOR DE ALUNOS É MENOR QUE 3
            MediasEmFaixas[0]++;
            //SE VERDADEIRO ADICIONA UMA ESTRELA À POSIÇÃO 0 NO VETOR MÉDIA EM FAIXAS
            }
            else if(Medias[ContadorAlunos] < 5) {
            //CHECA SE O VALOR DE MÉDIAS NA POSIÇÃO DO CONTADOR DE ALUNOS É MENOR QUE 5
            MediasEmFaixas[1]++;
            //SE VERDADEIRO ADICIONA UMA ESTRELA À POSIÇÃO 1 NO VETOR MÉDIA EM FAIXAS
            }
            else if(Medias[ContadorAlunos] < 7) {
            //CHECA SE O VALOR DE MÉDIAS NA POSIÇÃO DO CONTADOR DE ALUNOS É MENOR QUE 7
            MediasEmFaixas[2]++;
            //SE VERDADEIRO ADICIONA UMA ESTRELA À POSIÇÃO 2 NO VETOR MÉDIA EM FAIXAS
            }
            else if(Medias[ContadorAlunos] < 9) {
            //CHECA SE O VALOR DE MÉDIAS NA POSIÇÃO DO CONTADOR DE ALUNOS É MENOR QUE 9
            MediasEmFaixas[3]++;
            //SE VERDADEIRO ADICIONA UMA ESTRELA À POSIÇÃO 3 NO VETOR MÉDIA EM FAIXAS
            }
            else if(Medias[ContadorAlunos] >= 9) {
            //CHECA SE O VALOR DE MÉDIAS NA POSIÇÃO DO CONTADOR DE ALUNOS É MAIOR OU IGUAL A 9 
            MediasEmFaixas[4]++;
            //SE VERDADEIRO ADICIONA UMA ESTRELA À POSIÇÃO 4 NO VETOR MÉDIA EM FAIXAS
            }
        }

        String[] NomesFaixas = {"0-2.9", "3-4.9", "5-6.9", "7-8.9", "9-10"};
        //DEFINE O NOME DAS MÉDIAS MOSTRADAS EM FAIXAS

        int Faixas = 0;
        //VARIÁVEL QUE FARÁ CONTAGEM DAS FAIXAS

        while(Faixas < 5) {
        //LOOP QUE ADICIONARÁ ESTRELAS PARA CADA ALUNO DE ACORDO COM A FAIXA AO QUAL O MESMO PERTENCER

            System.out.print(NomesFaixas[Faixas] + " | ");
            //IMPRIME AS FAIXAS

            for(int ContadorDisciplinas = 0; ContadorDisciplinas < MediasEmFaixas[Faixas]; ContadorDisciplinas++) {
            //ESTRUTURA DE REPETIÇÃO | VARIÁVEL 'CONTADOR' CRIADO PARA NAVEGAR PELAS INFORMAÇÕES GUARDADAS EM DISCIPLINAS

            System.out.print("*");
            //IMPRIME AS ESTRELAS EM CADA UMA DAS FAIXAS

            }

            System.out.println();
            //ESPAÇO EM BRANCO (SALTAR LINHA)

            Faixas++;
            //INCREMENTA 1 AO VALOR DE FAIXAS

        }

        Scan.close();
        //FECHA O SCANNER PARA QUE A ENTRADA DE QUALQUER DADO NÃO SEJA MAIS ACEITA

    }
    
}