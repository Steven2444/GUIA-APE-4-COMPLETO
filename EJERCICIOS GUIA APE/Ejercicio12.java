public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Objeto como parametro: la cuenta destino se recibe como argumento
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo = this.saldo - monto;      // retira de la cuenta actual
            destino.saldo = destino.saldo + monto; // deposita en la destino
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de "
                    + titular);
        }
    }

    public void mostrarSaldo() {
        System.out.println(titular + " : $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Carlos", 500);
        Cuenta c2 = new Cuenta("Laura", 100);

        System.out.println("Saldos iniciales");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("\nTransferencia valida (200)");
        c1.transferir(c2, 200);

        System.out.println("\nTransferencia que falla (1000)");
        c1.transferir(c2, 1000);

        System.out.println("\nSaldos finales");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
