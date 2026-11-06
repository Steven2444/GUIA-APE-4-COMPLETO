public class Main {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.stock = 10;
        p.precioUnitario = 25.5;
        System.out.println("Valor total: " + p.calcularValorTotal());
    }
}
