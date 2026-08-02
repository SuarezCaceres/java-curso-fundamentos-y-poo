
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class PC02 {
    public static void main(String[] args) {
    Scanner intro=new Scanner (System.in);
    double centigrados,f;
        System.out.println("INGRESAR FRADOS EN CENTIGRADOS: ");
    centigrados=intro.nextDouble();
    f=(centigrados*9/5)+32;
        System.out.println("TRANSFORMADO A GRAFOS FARENHEIT ES  :"+f +" °");
    }
}
