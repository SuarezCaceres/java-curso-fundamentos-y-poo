
package JEjercicios_repetitivo;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio03 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int dia=0;
        boolean diainvalido =true;
        do{
            System.out.println("INGRESE UN DIA DEL 1-7");
            dia=intro.nextInt();
            diainvalido=(dia<1 || dia>7);
        }while(diainvalido);
        System.out.println("EL DIA INGRESADO ES : "+dia);
    }
}
