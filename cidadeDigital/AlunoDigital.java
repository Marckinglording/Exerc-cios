package cidadeDigital;

public class AlunoDigital extends PessoaDigital{
    
    protected String areaAprendizado;
    protected String matriculaDigital;
    protected int nivelEnergia;
    protected int creditosComputacionais;

    public AlunoDigital(String nome, String cpf, String tipo, String areaAprendizado, String matriculaDigital, int nivelEnergia, int creditosComputacionais) {
        super(nome, cpf, tipo);
        this.areaAprendizado = areaAprendizado;
        this.matriculaDigital = matriculaDigital;
        this.nivelEnergia = nivelEnergia;
        this.creditosComputacionais = creditosComputacionais; 
    }

    public void acessarAreasCidade() {

    }

    public void consultarStatusAcademico() {
        
    }

}
