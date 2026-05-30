package cidadeDigital;

public abstract class PessoaDigital {

    protected String nome;
    protected String cpf;
    
    public PessoaDigital(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        String tipo = getClass().getSimpleName().replaceAll("(?<!^)(?=[A-Z])(.*)", "");
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
