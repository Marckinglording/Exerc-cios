package AtividadesPOO.Ecommerce.src;

public class ProdutoFisico extends Produto{

    private static final double fretePorKg = 4.0;
    
    public ProdutoFisico(String nome, double precoBase, double peso) {

        super(nome, precoBase, peso);

    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (getPeso() * fretePorKg);
    }

}
