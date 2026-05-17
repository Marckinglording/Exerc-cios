package AtividadesPOO.Ecommerce.src;

public class ProdutoDigital extends Produto {

    private static final double taxaDeDownload = 3.0;
    
    public ProdutoDigital(String nome, double precoBase, double peso) {

        super(nome, precoBase, peso);

    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + taxaDeDownload;
    }

}
