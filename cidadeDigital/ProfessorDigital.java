package cidadeDigital;

public class ProfessorDigital extends PessoaDigital{
    
    protected int codigoFuncional;
    protected String especialidade;
    protected int nivelAutorizacao;
    protected String setorAutorizacao;

    public ProfessorDigital(String nome, String cpf, int codigoFuncional, String especialidade, int nivelAutorizacao, String setorAutorizacao) {
        super(nome, cpf);
        this.codigoFuncional = codigoFuncional;
        this.especialidade = especialidade;
        this.nivelAutorizacao = nivelAutorizacao;
        this.setorAutorizacao = setorAutorizacao; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Código Funcional: " + this.codigoFuncional);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Nível de autorização: " + this.nivelAutorizacao);
        System.out.println("Setor de autorização: " + this.setorAutorizacao);
    }

    public void supervisionarSistemas() {

    }

    public void liberarAcessoSetores() {
        
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int novoCodigoFuncional) {
        this.codigoFuncional = novoCodigoFuncional;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String novaEspecialidade) {
        this.especialidade = novaEspecialidade;
    }

    public int getNivelAutorizacao() {
        return nivelAutorizacao;
    }

    public void setNivelAutorizacao(int novoNivelAutorizacao) {
        this.nivelAutorizacao = novoNivelAutorizacao;
    }

    public String getSetorAutorizacao() {
        return setorAutorizacao;
    }

    public void setSetorAutorizacao(String novoSetorAutorizacao) {
        this.setorAutorizacao = novoSetorAutorizacao;
    }

}
