public class EstrategiaPaypal implements PagamentoEstrategi {

    private String emailId;
    private String senha;

    public EstrategiaPaypal(String emailId, String senha) {
        this.emailId = emailId;
        this.senha = senha;
    }

    @Override
    public void pagamento(double montante) {
       System.out.println(montante + " pago usando Paypal.");
        
    }
    
}
