public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Victor", "102031");

        conta1.depositar(1000.0);
        conta1.sacar(732.1);

        System.out.println(conta1.consultarSaldo());
        System.out.println(conta1.mostrarDados());
    }
}