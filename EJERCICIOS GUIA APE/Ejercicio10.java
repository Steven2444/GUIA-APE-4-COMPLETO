public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Devuelve un double: el area se usa en otros calculos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Devuelve un boolean: es cuadrado si base y altura son iguales
    public boolean esCuadrado() {
        return base == altura;
    }

    // Devuelve un String con la descripcion
    public String obtenerDescripcion() {
        return "Rectangulo de " + base + " x " + altura;
    }

    // void: solo imprime, no devuelve nada
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Es cuadrado: " + esCuadrado());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        Rectangulo r2 = new Rectangulo(5.0, 5.0);

        r1.mostrar();
        System.out.println();
        r2.mostrar();
    }
}
