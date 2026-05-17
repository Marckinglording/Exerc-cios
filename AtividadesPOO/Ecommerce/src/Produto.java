package AtividadesPOO.Ecommerce.src;

public class Produto {

    private String nome;
    private double precoBase;
    private double peso;
    
    public Produto(String nome, double precoBase, double peso) {

        this.nome = nome;
        this.precoBase = precoBase;
        this.peso = peso;

    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double novoPreco) {
        if(novoPreco >= 0) {
            this.precoBase = novoPreco;
        }else {
            this.precoBase = 0;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso) {
        if(novoPeso >= 0) {
            this.peso = novoPeso;
        }else {
            this.peso = 0;
        }
    }

}