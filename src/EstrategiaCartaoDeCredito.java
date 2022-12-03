public class EstrategiaCartaoDeCredito implements PagamentoEstrategi {

    private String nome;
    private String numeroCartao;
    private String cvv;
    private String dataExpirar;


    public EstrategiaCartaoDeCredito(String nome, String numeroCartao, String cvv, String dataExpirar) {
        this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.dataExpirar = dataExpirar;
    }


    @Override
    public void pagamento(double montante) {
        System.out.println(montante + " pago com cartao de credito/débito.");
    }

    
    
}
