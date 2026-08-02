
package JEjercicios_repetitivo;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjericio02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int num;
        do{
            System.out.println("INGRESE UH NUMERO POSITIVO");
            num=intro.nextInt();
        }while (num>=0 && num<=10);
    }
}
