
/**
 *
 * @author USER
 */
public class animal {
        public String nombre;
         public String color;
         public int edad;
         public int peso;
         public boolean s;
    public animal(String nombre, String color, int edad, int peso, boolean s) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.s = s;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }
         
}
