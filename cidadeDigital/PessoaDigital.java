package cidadeDigital;

public abstract class PessoaDigital {

    protected String nome;
    protected String cpf;
    protected String tipo;
    
    public PessoaDigital(String nome, String cpf, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("\nInformações do " + tipo + ":\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
