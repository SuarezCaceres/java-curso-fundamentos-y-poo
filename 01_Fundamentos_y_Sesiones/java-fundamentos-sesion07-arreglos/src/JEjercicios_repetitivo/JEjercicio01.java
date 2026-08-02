
package JEjercicios_repetitivo;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int i=1,num,mull;
        System.out.println("INGRESE UN NUMERO ENTERO ");
        num =intro.nextInt();
        do{
            mull=num*i;
            System.out.printf("%d * %2d = %3d\n",num,i,mull);
            i++;
        }while(i<=12);
    }
}
