public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 5;
        m1.peso = 25.5;

        Mascota m2 = new Mascota();
        m2.nombre = "Michi";
        m2.especie = "Gato";
        m2.edad = 3;
        m2.peso = 4.2;

        Mascota m3 = new Mascota();
        m3.nombre = "Rocky";
        m3.especie = "Perro";
        m3.edad = 2;
        m3.peso = 12;

        System.out.println("MASCOTAS");

        if (m1.peso > 20) {
            System.out.println(m1.nombre + " : " + m1.especie + " : "
                    + m1.peso + " Revisar peso");
        } else {
            System.out.println(m1.nombre + " : " + m1.especie + " : " + m1.peso);
        }

        if (m2.peso > 20) {
            System.out.println(m2.nombre + " : " + m2.especie + " : "
                    + m2.peso + " Revisar peso");
        } else {
            System.out.println(m2.nombre + " : " + m2.especie + " : " + m2.peso);
        }

        if (m3.peso > 20) {
            System.out.println(m3.nombre + " : " + m3.especie + " : "
                    + m3.peso + " Revisar peso");
        } else {
            System.out.println(m3.nombre + " : " + m3.especie + " : " + m3.peso);
        }

        System.out.println();
        System.out.println("Edad de m1 antes: " + m1.edad);

        Mascota m4 = m1;
        m4.edad = m4.edad + 1;

        System.out.println("Edad de m1 despues: " + m1.edad);

    }
}

public class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;
}
