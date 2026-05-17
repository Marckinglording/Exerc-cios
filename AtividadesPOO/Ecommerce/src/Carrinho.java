package AtividadesPOO.Ecommerce.src;
import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void calcularTotal() {

        double total= 0;

        for(int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).calcularPrecoFinal();
        }

    }
    
}