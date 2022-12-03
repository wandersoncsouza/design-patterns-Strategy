import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    
    List<Item> items;

    public CarrinhoCompra(List<Item> items) {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calcularTotal(){
        double soma = 0;
        for(Item item : items){
            soma += item.getPreco();
        }
        return soma;
    }

    public void pagamento(PagamentoEstrategi metodoDePagamento){
        double montante = calcularTotal();
        metodoDePagamento.pagamento(montante);
    }
    
}
