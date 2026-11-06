public class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Objeto como parametro: trabaja sobre el Producto recibido
    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.precio;
            System.out.println("Venta realizada. Total a pagar: $" + total);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Mochila", 25.0, 10);
        p.mostrarProducto();

        System.out.println("\n-- Venta de 4 unidades --");
        Venta v1 = new Venta(4);
        v1.aplicar(p);
        p.mostrarProducto();

        System.out.println("\n-- Venta de 8 unidades --");
        Venta v2 = new Venta(8);
        v2.aplicar(p);
        p.mostrarProducto();
    }
}

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Solo reduce el stock si alcanza; devuelve true si lo logro
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    public void mostrarProducto() {
        System.out.println(nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

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
