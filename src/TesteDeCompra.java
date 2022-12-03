public class TesteDeCompra {
    public static void main(String[] args) {
        
        CarrinhoCompra carrinho = new CarrinhoCompra(null);

        Item item1 = new Item("2324", 12.50);
        Item item2 = new Item("8485", 29.45);

        carrinho.addItem(item1);
        carrinho.addItem(item2);

        carrinho.pagamento(new EstrategiaPaypal("w_costasouza@hotmail.com", "5554@test"));
        carrinho.pagamento(new EstrategiaCartaoDeCredito("WandersonCS", "5544 4322 6754 6787", "455", "12/25"));
    }
}
