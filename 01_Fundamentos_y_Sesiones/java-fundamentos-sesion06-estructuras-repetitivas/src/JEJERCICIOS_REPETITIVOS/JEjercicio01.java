
package JEJERCICIOS_REPETITIVOS;

import java.util.Scanner;

/**
 *
 * @author SUAREZ CACERES SERGIO MATEO
 */
public class JEjercicio01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int num;
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        while(num<=0){
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        }
        System.out.println("NUMERO "+num +" "+"ES ENTERO POSITIVO");
    }
    
}
