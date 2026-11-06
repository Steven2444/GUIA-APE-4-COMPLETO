public class Libro {
    String titulo;
    int anio;
    Autor autor; // objeto como atributo

    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Anio: " + anio);
        System.out.println("Autor: " + autor.nombre + " (" + autor.nacionalidad + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("Jorge Icaza", "Ecuatoriana");

        Libro l1 = new Libro("Cien anios de soledad", 1967, a1);
        Libro l2 = new Libro("Huasipungo", 1934, a2);

        l1.mostrarInformacion();
        System.out.println();
        l2.mostrarInformacion();
    }
}

public class Autor {
    String nombre;
    String nacionalidad;

    // Constructor: recibe los datos del autor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}
