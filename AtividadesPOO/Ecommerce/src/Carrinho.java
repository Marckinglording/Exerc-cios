package AtividadesPOO.Ecommerce.src;
import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<>();  

    public void adicionarProduto(Produto produtoAdicionado){
        produtos.add(produtoAdicionado);
    }

    public double calcularTotal() {

        double total= 0;

        for(int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).calcularPrecoFinal();
        }

        return total;

    }
    
}