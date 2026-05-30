package cidadeDigital;

public class AlunoDigital extends PessoaDigital{
    
    protected String areaAprendizado;
    protected String matriculaDigital;
    protected int nivelEnergia;
    protected int creditosComputacionais;

    public AlunoDigital(String nome, String cpf, String areaAprendizado, String matriculaDigital, int nivelEnergia, int creditosComputacionais) {
        super(nome, cpf);

        this.areaAprendizado = areaAprendizado;
        this.matriculaDigital = matriculaDigital;
        this.nivelEnergia = nivelEnergia;
        this.creditosComputacionais = creditosComputacionais; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Área de aprendizado: " + this.areaAprendizado);
        System.out.println("Matrícula digital: " + this.matriculaDigital);
        System.out.println("Nível de energia: " + this.nivelEnergia);
        System.out.println("Créditos computacionais: " + this.creditosComputacionais);
    }

    public void acessarAreasCidade() {

    }

    public void consultarStatusAcademico() {
        
    }

    public String getAreaAprendizado() {
        return areaAprendizado;
    }

    public void setAreaAprendizado(String novaAreaAprendizado) {
        this.areaAprendizado = novaAreaAprendizado;
    }

    public String getMatriculaDigital() {
        return matriculaDigital;
    }

    public void setMatriculaDigital(String novaMatriculaDigital) {
        this.matriculaDigital = novaMatriculaDigital;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int novoNivelEnergia) {
        this.nivelEnergia = novoNivelEnergia;
    }

    public int getCreditosComputacionais() {
        return creditosComputacionais;
    }

    public void setCreditosComputacionais(int novosCreditosComputacionais) {
        this.creditosComputacionais = novosCreditosComputacionais;
    }
    
}
