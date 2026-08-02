
package utp.edu.pe.poo.ejercicios;

public class Coche {
    // Atributos de instancia
    public String marca;
    public String modelo;
    public int año;

    // Atributo de clase
    public static int numeroDeCoches = 0;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        numeroDeCoches++; 
    }
}


