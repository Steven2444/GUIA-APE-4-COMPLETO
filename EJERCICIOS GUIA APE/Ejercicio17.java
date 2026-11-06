public class Cuenta {
    String titular;
    double saldo;
}

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.titular = "Carlos";
        c1.saldo = 200;

        Cuenta c2 = new Cuenta();
        c2.titular = "Laura";
        c2.saldo = 350;

        int meses1 = 0;
        int meses2 = 0;

        System.out.println("CUENTA DE " + c1.titular);
        while (c1.saldo < 500) {
            c1.saldo = c1.saldo + 50;
            meses1 = meses1 + 1;
            System.out.println(c1.titular + " : " + c1.saldo);
        }

        System.out.println();

        System.out.println("CUENTA DE " + c2.titular);
        while (c2.saldo < 500) {
            c2.saldo = c2.saldo + 50;
            meses2 = meses2 + 1;
            System.out.println(c2.titular + " : " + c2.saldo);
        }

        System.out.println();
        System.out.println(c1.titular + " necesito " + meses1 + " meses");
        System.out.println(c2.titular + " necesito " + meses2 + " meses");
    }
}

public class Libro {
    String titulo;
    String autor;
    boolean disponible;
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "Don Quijote";
        l1.autor = "Cervantes";
        l1.disponible = true;

        Libro l2 = new Libro();
        l2.titulo = "El Principito";
        l2.autor = "Saint-Exupery";
        l2.disponible = true;

        Libro l3 = new Libro();
        l3.titulo = "Rayuela";
        l3.autor = "Cortazar";
        l3.disponible = true;

        Libro l4 = new Libro();
        l4.titulo = "Ficciones";
        l4.autor = "Borges";
        l4.disponible = true;

        Socio s1 = new Socio();
        s1.nombre = "Maria";
        s1.librosPrestados = 0;

        Socio s2 = new Socio();
        s2.nombre = "Juan";
        s2.librosPrestados = 0;

        l1.disponible = false;
        s1.librosPrestados = s1.librosPrestados + 1;
        l2.disponible = false;
        s1.librosPrestados = s1.librosPrestados + 1;

        l3.disponible = false;
        s2.librosPrestados = s2.librosPrestados + 1;

        int disponibles = 0;

        System.out.println("LIBROS");

        if (l1.disponible) {
            System.out.println(l1.titulo + " : Disponible");
            disponibles = disponibles + 1;
        } else {
            System.out.println(l1.titulo + " : Prestado");
        }

        if (l2.disponible) {
            System.out.println(l2.titulo + " : Disponible");
            disponibles = disponibles + 1;
        } else {
            System.out.println(l2.titulo + " : Prestado");
        }

        if (l3.disponible) {
            System.out.println(l3.titulo + " : Disponible");
            disponibles = disponibles + 1;
        } else {
            System.out.println(l3.titulo + " : Prestado");
        }

        if (l4.disponible) {
            System.out.println(l4.titulo + " : Disponible");
            disponibles = disponibles + 1;
        } else {
            System.out.println(l4.titulo + " : Prestado");
        }

        System.out.println();
        System.out.println("SOCIOS");
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);

        System.out.println();
        System.out.println("Libros disponibles: " + disponibles);
    }
}

public class Socio {
    String nombre;
    int librosPrestados;
}
