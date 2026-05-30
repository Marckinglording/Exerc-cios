package cidadeDigital;

public class ProfessorDigital extends PessoaDigital{
    
    protected int codigoFuncional;
    protected String especialidade;
    protected int nivelAutorizacao;
    protected String setorAutorizacao;

    public ProfessorDigital(String nome, String cpf, String tipo, int codigoFuncional, String especialidade, int nivelAutorizacao, String setorAutorizacao) {
        super(nome, cpf, tipo);
        this.codigoFuncional = codigoFuncional;
        this.especialidade = especialidade;
        this.nivelAutorizacao = nivelAutorizacao;
        this.setorAutorizacao = setorAutorizacao; 
    }

    public void supervisionarSistemas() {

    }

    public void liberarAcessoSetores() {
        
    }

}
