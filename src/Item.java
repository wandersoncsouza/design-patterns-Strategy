public class Item {
    
    private String cupomDesconto;
    private Double preco;

    public Item(String cupomDesconto, Double preco) {
        this.cupomDesconto = cupomDesconto;
        this.preco = preco;
    }

    public String getCupomDesconto() {
        return cupomDesconto;
    }

    public double getPreco() {
        return preco;
    }
    
}
