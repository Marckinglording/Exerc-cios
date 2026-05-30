package cidadeDigital;

public class CentralSistema {
    
    public static void main(String[] args) {
        AlunoDigital aluno = new AlunoDigital("Marcos Ferreira de Lima", "71027633102", "aluno", "TADS", "202511730", 1, 100);
        ProfessorDigital professor = new ProfessorDigital("Milton Júnior", "14452263389", "professor", 150687, "Algorítmos e lógica computacional", 2, "Amplo");
        GuardaDigital guarda = new GuardaDigital("Bruno Henrique", "74458896632", "guarda", "150678", 3, "Laboratórios", "Em progresso");
        
        aluno.exibirInformacoes();
        professor.exibirInformacoes();
        guarda.exibirInformacoes();

    }

}
