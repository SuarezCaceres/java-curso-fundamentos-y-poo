

/**
 *
 * @author USER
 */
public class Leon extends Animañ {
public double peso;
public String crias;

    public Leon(double peso, String crias, String nombre, int edad, String codigo) {
        super(nombre, edad, codigo);
        this.peso = peso;
        this.crias = crias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCrias() {
        return crias;
    }

    public void setCrias(String crias) {
        this.crias = crias;
    }
    
    
        public void comer (){
        System.out.println("el leon esta almorzando");
    }
    
    @Override
public void saltar() {
    System.out.println("El animal puede saltar ");
}
    

    @Override
    public void camina(){
        System.out.println("el leon esta corriendo");
    }
    
}
