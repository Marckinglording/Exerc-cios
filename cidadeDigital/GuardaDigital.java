package cidadeDigital;

public class GuardaDigital extends PessoaDigital{
    
    protected int identificacaoMilitar;
    protected int nivelSeguranca;
    protected String setorMonitorado;
    protected String statusPatrulha;

    public GuardaDigital(String nome, String cpf, String tipo, int identificacaoMilitar, int nivelSeguranca, String setorMonitorado, String statusPatrulha) {
        super(nome, cpf, tipo);
        this.identificacaoMilitar = identificacaoMilitar;
        this.nivelSeguranca = nivelSeguranca;
        this.setorMonitorado = setorMonitorado;
        this.statusPatrulha = statusPatrulha; 
    }

    public void monitorarAcessos() {

    }

    public void emitirAlertas() {
        
    }

}
