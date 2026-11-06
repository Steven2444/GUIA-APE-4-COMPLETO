public class Main {

    // a y b son PARAMETROS: variables declaradas en la firma del metodo
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 5 y 3 son ARGUMENTOS: valores reales enviados al llamar el metodo
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
