public class Libro {
    String titulo;
    boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    // Presta el libro solo si esta disponible
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}

public class Usuario {
    String nombre;
    String cedula;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Maria", "1801234567");
        Usuario u2 = new Usuario("Juan", "1807654321");
        Libro libro = new Libro("Don Quijote");

        // Dos usuarios intentan pedir el mismo libro
        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar();
        p2.registrar();

        System.out.println("\nMaria devuelve el libro.");
        libro.devolver();
        p2.registrar();
    }
}

public class Prestamo {
    Usuario usuario; // colabora con Usuario
    Libro libro;     // colabora con Libro

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println(usuario.nombre + " (CI " + usuario.cedula + ") obtuvo el libro \""
                    + libro.titulo + "\".");
        } else {
            System.out.println(usuario.nombre + " (CI " + usuario.cedula + ") no pudo obtener \""
                    + libro.titulo + "\": ya esta prestado.");
        }
    }
}
