
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class PC3 {
    public static void main(String[] args) {
        Scanner intro=new Scanner (System.in);
        double soles,dolares;
        System.out.println("INGRESE SU DINERO EN SOLES");
        soles=intro.nextDouble();
        dolares=soles*3.72;
        System.out.println("SU DINERO AL CAMBIO AL DIA DE HOY ES :"+dolares +"$");
             
    }
    
}
