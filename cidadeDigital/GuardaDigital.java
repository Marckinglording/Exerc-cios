package cidadeDigital;

public class GuardaDigital extends PessoaDigital{
    
    protected String identificacaoMilitar;
    protected int nivelSeguranca;
    protected String setorMonitorado;
    protected String statusPatrulha;

    public GuardaDigital(String nome, String cpf, String identificacaoMilitar, int nivelSeguranca, String setorMonitorado, String statusPatrulha) {
        super(nome, cpf);
        this.identificacaoMilitar = identificacaoMilitar;
        this.nivelSeguranca = nivelSeguranca;
        this.setorMonitorado = setorMonitorado;
        this.statusPatrulha = statusPatrulha; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Identificação Militar: " + this.identificacaoMilitar);
        System.out.println("Nível de segurança: " + this.nivelSeguranca);
        System.out.println("Setor monitorado: " + this.setorMonitorado);
        System.out.println("Status de patrulha: " + this.statusPatrulha);
    }

    public void monitorarAcessos() {

    }

    public void emitirAlertar() {

    }

    public String getIdentificacaoMilitar() {
        return identificacaoMilitar;
    }

    public void setIdentificacaoMilitar(String novaIdentificacaoMilitar) {
        this.identificacaoMilitar = novaIdentificacaoMilitar;
    }

    public int getNivelSeguranca() {
        return nivelSeguranca;
    }

    public void setNivelSeguranca(int novoNivelSeguranca) {
        this.nivelSeguranca = novoNivelSeguranca;
    }

    public String getSetorMonitorado() {
        return setorMonitorado;
    }

    public void setSetorMonitorado(String novoSetorMonitorado) {
        this.setorMonitorado = novoSetorMonitorado;
    }

    public String getStatusPatrulha() {
        return statusPatrulha;
    }

    public void setStatusPatrulha(String novoStatusPatrulha) {
        this.statusPatrulha = novoStatusPatrulha;
    }

}
