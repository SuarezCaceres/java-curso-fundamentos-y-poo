
package JEjercicio;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio_01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int i,cant;
        System.out.println("INGRESE CANTIDAD DE NUMEROS ESTEROS POSTIVOS");
        cant=intro.nextInt();
        for(i=1;i<=cant;i++){
        System.out.println(""+i);
    }
    }  
}
