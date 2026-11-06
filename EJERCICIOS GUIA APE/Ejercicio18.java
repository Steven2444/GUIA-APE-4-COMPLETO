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
