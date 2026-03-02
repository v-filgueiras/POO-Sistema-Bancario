public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldoConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoConta = 0;
    }

    public void depositar(double deposito) {
        if (deposito <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        else {
            this.saldoConta = this.saldoConta + deposito;
        }
    }

    public void sacar(double saque) {
        if (saque > this.saldoConta) {
            throw new IllegalArgumentException("O valor deve ser menor ou igual ao saldo da conta.");
        }

        if (saque <= 0) {
            throw new IllegalArgumentException("O valor de saque deve ser superior a zero.");
        }

        else {
            this.saldoConta = this.saldoConta - saque;
        }
    }

    public double consultarSaldo() {
        return saldoConta;
    }

    public String mostrarDados() { 
        return "Nome: " + this.titular + "\n" + 
               "Conta: " + this.numeroConta + "\n" + 
               "Saldo: " + this.saldoConta; 
    }
}