
package JEJERCICIOS_REPETITIVOS;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class EJERCICIO_REPETITIVO_02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int num;
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        while(num>0){
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        if(num<=0){
            System.out.println("NUMERO" +num+"NO ES POSTIVO");
            }else{
            System.out.println("NUMERO "+num +" "+"ES ENTERO POSITIVO");
        }
    }
}
}
