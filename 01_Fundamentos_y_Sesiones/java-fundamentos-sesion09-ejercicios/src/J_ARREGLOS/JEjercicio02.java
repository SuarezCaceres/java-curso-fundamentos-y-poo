
package J_ARREGLOS;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int [] notas = {15,20,10,16,14,13,18,11,9,8};
        for(int i=0;i<10;i++){
            System.out.println("ESTUDIANTE "+(i+1)+" :"+notas[i]);
        }
    }
}
