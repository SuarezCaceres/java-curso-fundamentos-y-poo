
package JEJERCICIOS_REPETITIVOS;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JERCICIO {
      public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int num;
        boolean numpos=true;
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        while(numpos){
        System.out.println("INGRESE NUMERO ENTERO POSITIVO");
        num =intro.nextInt();
        numpos=(num<=0);
    }
          System.out.println("NUMERO "+num +" "+"ES ENTERO POSITIVO\"");
}
}
