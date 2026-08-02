
package JEjercicio;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio_04 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int i,j,dia,sem;
        System.out.println("INGRESE CANT DE SEMANANAS");
        sem=intro.nextInt();
        System.out.println("INGRESE CANTIDAD DE DIAS");
        dia=intro.nextInt();
        for(i=1; i<=sem;i++){
            System.out.println("SEMANA "+i);
            for (j=i;j<=dia; j++) {
                System.out.println("DIA :"+j);
            }
        }
    }
    
}
