public class Main {
    public static void main(String[] args) {
        Validador v = new Validador();
        System.out.println("Edad 25: " + v.verificarEdad(25));
        System.out.println("Edad -3: " + v.verificarEdad(-3));
        System.out.println("Edad 150: " + v.verificarEdad(150));
    }
}
