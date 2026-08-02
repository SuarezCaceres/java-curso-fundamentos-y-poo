
import java.util.Scanner;



/**
 *
 * @author LAB-USR-SJL
 */
public class ejercicio02 {
    public static void main(String[] args) {
        //variables
        Scanner intro = new Scanner(System.in);
        int n1,n2,r,n3=5;
        System.out.println("INGRESE 1ER NUMERO");
        n1=intro.nextInt();// nect int por tipo entero
        System.out.println("INGRESE 2do NUMERO");
        n2=intro.nextInt();
        r=n1+n2-n3;
        System.out.println("RESULTADO:"+r);
    }
}
