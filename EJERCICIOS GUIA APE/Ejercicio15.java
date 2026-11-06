public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Cuaderno";
        p1.precio = 1.5;
        p1.stock = 7;

        Producto p2 = new Producto();
        p2.nombre = "Lapiz";
        p2.precio = 0.5;
        p2.stock = 20;

        Producto p3 = new Producto();
        p3.nombre = "Mochila";
        p3.precio = 25;
        p3.stock = 6;

        Producto p4 = new Producto();
        p4.nombre = "Borrador";
        p4.precio = 0.75;
        p4.stock = 8;

        System.out.println("PRODUCTOS");
        System.out.println(p1.nombre + " : " + p1.precio);
        System.out.println(p2.nombre + " : " + p2.precio);
        System.out.println(p3.nombre + " : " + p3.precio);
        System.out.println(p4.nombre + " : " + p4.precio);

        // Venta de 3 unidades de dos productos
        p1.stock = p1.stock - 3;
        p3.stock = p3.stock - 3;

        System.out.println();
        System.out.println("DESPUES DE LA VENTA");

        if (p1.stock < 5) {
            System.out.println(p1.nombre + " : " + p1.precio + " Reponer");
        } else {
            System.out.println(p1.nombre + " : " + p1.precio);
        }

        if (p2.stock < 5) {
            System.out.println(p2.nombre + " : " + p2.precio + " Reponer");
        } else {
            System.out.println(p2.nombre + " : " + p2.precio);
        }

        if (p3.stock < 5) {
            System.out.println(p3.nombre + " : " + p3.precio + " Reponer");
        } else {
            System.out.println(p3.nombre + " : " + p3.precio);
        }

        if (p4.stock < 5) {
            System.out.println(p4.nombre + " : " + p4.precio + " Reponer");
        } else {
            System.out.println(p4.nombre + " : " + p4.precio);
        }

        double total = p1.precio * p1.stock + p2.precio * p2.stock
                + p3.precio * p3.stock + p4.precio * p4.stock;

        System.out.println();
        System.out.println("Valor total del inventario: " + total);
    }
}

public class Producto {
    String nombre;
    double precio;
    int stock;
}
