public class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.nota1 = 8;
        e1.nota2 = 9;
        e1.nota3 = 7;
        e1.promedio = (e1.nota1 + e1.nota2 + e1.nota3) / 3;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Luis";
        e2.nota1 = 6;
        e2.nota2 = 5;
        e2.nota3 = 7;
        e2.promedio = (e2.nota1 + e2.nota2 + e2.nota3) / 3;

        Estudiante e3 = new Estudiante();
        e3.nombre = "Maria";
        e3.nota1 = 4;
        e3.nota2 = 3;
        e3.nota3 = 5;
        e3.promedio = (e3.nota1 + e3.nota2 + e3.nota3) / 3;

        Estudiante e4 = new Estudiante();
        e4.nombre = "Pedro";
        e4.nota1 = 10;
        e4.nota2 = 9;
        e4.nota3 = 8;
        e4.promedio = (e4.nota1 + e4.nota2 + e4.nota3) / 3;

        Estudiante e5 = new Estudiante();
        e5.nombre = "Sofia";
        e5.nota1 = 7;
        e5.nota2 = 6;
        e5.nota3 = 8;
        e5.promedio = (e5.nota1 + e5.nota2 + e5.nota3) / 3;

        int aprobados = 0;

        System.out.println("NOTAS DEL CURSO");

        if (e1.promedio >= 7) {
            System.out.println(e1.nombre + " : " + e1.promedio + " Aprobado");
            aprobados = aprobados + 1;
        } else if (e1.promedio >= 5) {
            System.out.println(e1.nombre + " : " + e1.promedio + " Supletorio");
        } else {
            System.out.println(e1.nombre + " : " + e1.promedio + " Reprobado");
        }

        if (e2.promedio >= 7) {
            System.out.println(e2.nombre + " : " + e2.promedio + " Aprobado");
            aprobados = aprobados + 1;
        } else if (e2.promedio >= 5) {
            System.out.println(e2.nombre + " : " + e2.promedio + " Supletorio");
        } else {
            System.out.println(e2.nombre + " : " + e2.promedio + " Reprobado");
        }

        if (e3.promedio >= 7) {
            System.out.println(e3.nombre + " : " + e3.promedio + " Aprobado");
            aprobados = aprobados + 1;
        } else if (e3.promedio >= 5) {
            System.out.println(e3.nombre + " : " + e3.promedio + " Supletorio");
        } else {
            System.out.println(e3.nombre + " : " + e3.promedio + " Reprobado");
        }

        if (e4.promedio >= 7) {
            System.out.println(e4.nombre + " : " + e4.promedio + " Aprobado");
            aprobados = aprobados + 1;
        } else if (e4.promedio >= 5) {
            System.out.println(e4.nombre + " : " + e4.promedio + " Supletorio");
        } else {
            System.out.println(e4.nombre + " : " + e4.promedio + " Reprobado");
        }

        if (e5.promedio >= 7) {
            System.out.println(e5.nombre + " : " + e5.promedio + " Aprobado");
            aprobados = aprobados + 1;
        } else if (e5.promedio >= 5) {
            System.out.println(e5.nombre + " : " + e5.promedio + " Supletorio");
        } else {
            System.out.println(e5.nombre + " : " + e5.promedio + " Reprobado");
        }

        System.out.println("Cantidad de estudiantes que aprobaron: " + aprobados);
    }
}
