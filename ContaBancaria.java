public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldoConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoConta = 0;
    }
}