## Desafio de Projeto do Lab's (Explorando Padrões de Projetos na Prática com Java) -> Potência Tech powered by iFood - Java Beginners
 

# Design Pattern - Strategy

Neste projeto foi tentado implementar um simples "Carrinho de Compras" que tem duas estrategias de pagamento. 
- Usando uma conta PayPal 
- Usando um cartão de crédito ou débito

Primeiro foi criado uma interface para a estrategia de pagamento para pagar o montante passado como argumento (PagamentoEstrategi.java)

Depois foi criado uma implementação para pagamento usando cartão de credito/debito ou paypal
(EstrategiaCartaoCredito.java/ EstrategiaPaypal.java)

Depois foi implementado o CarrinhoCompra.java com seu método de pagamento que iremos informar a(s) forma de pagamento

Observamos que o método do carrinho solicita o algoritimo de pagamento como argumento e não o guarda como instancia da variavel.

Resumo: 

Com o padrão strategy, quando houver algum tipo de mudança no formato do pagamento, não precisamos fazer nenhuma alteração na classe principal (CarrinhoCompra), é só alterar as estrategias ou criar uma nova.
