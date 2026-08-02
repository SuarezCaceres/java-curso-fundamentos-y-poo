/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Caballo extends Animañ {
public String dueño;

    public Caballo(String dueño, String nombre, int edad, String codigo) {
        super(nombre, edad, codigo);
        this.dueño = dueño;
    }
    
        public static  void correr () {
            System.out.println("el animal esta corriendo feliz");
}
        
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    public void saltar() {
    System.out.println("El caballo  puede saltar ");
}
    @Override
public void camina (){
        System.out.println("El caballo esta trotando");
}
    
    
    

}
