public class Main {

    public static void modificar(int numero) {
        numero = numero + 5;
        System.out.println("Dentro del metodo: " + numero);
    }

    public static void main(String[] args) {
        int numero = 10;
        modificar(numero);
        // Imprime 10: Java usa paso por valor, el metodo trabaja con una copia
        System.out.println("Despues del metodo: " + numero);
    }
}
