package ufro.com.holaMundo.modelo;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String rut;

    public Persona(String nombre, int edad, double estatura, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getRut() {
        return rut;
    }
}
