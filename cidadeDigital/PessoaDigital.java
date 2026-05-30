package cidadeDigital;

public class PessoaDigital {

    protected String nome;
    protected String cpf;
    protected String tipo;
    
    public PessoaDigital(String nome, String cpf, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cpf = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Informações do " + tipo + ":");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

}
