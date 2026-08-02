
import java.util.Scanner;


/**
 *
 * @author SUAREZ SERGIO
 */
public class sesion01 {
    public static void main(String[] args) {
        String nombre,apellido;// variable de tipo cadena de texto
        int ed;// variable de tipo entero
        double talla;//variable de tipo decimal
        char gen;
       Scanner intro = new Scanner (System.in);//captura el valor que le doy a la variable
        System.out.println("UTP - TALLER DE PROGRAMACION...");//escribir 
        System.out.println("ciclo 2024-1");
        System.out.println("_.-");
        System.out.println("");
        System.out.println("INGRESE NOMBRE: ");
        nombre=intro.nextLine();
        System.out.println("INGRESE APELLIDO: ");
        apellido=intro.nextLine();
        System.out.println("INGRESE EDAD: ");
        ed=intro.nextInt();
        System.out.println("INGRESE ESTATURA: ");
        talla=intro.nextDouble();
        System.out.println("INGRESE SEXO");
        gen=intro.next().charAt(0);
        System.out.println("tus datos personales son: " +nombre + " " +apellido);
        System.out.println("ahora se que tu edad es: " +ed+" y mides: "+talla +" "+gen);
       
    }
}
