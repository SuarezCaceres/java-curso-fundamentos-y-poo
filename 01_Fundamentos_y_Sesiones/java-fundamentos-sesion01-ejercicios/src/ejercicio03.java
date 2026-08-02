
import java.util.Scanner;



/**
 *
 * @author SUAREZ SERGIO
 */
public class ejercicio03 {
    public static void main(String[] args) {//psvm
        Scanner intro=new Scanner(System.in);
        int n1,n2,n3;
        double prom;
        String msj;
        msj= "USD TIENE DE PROMEDIO: ";
        System.out.println("INGRESAR NOTA 01:");
        n1=intro.nextInt();
        System.out.println("INGRESAR NOTA 02:");
        n2=intro.nextInt();
        System.out.println("INGRESAR NOTA 03:");
        n3=intro.nextInt();
        prom=(n1+n2+n3)/3;
        System.out.println("PROMEDIO OBTENIDO: " +prom);
        System.out.println("-------------------");
        System.out.println(msj+prom);
        
    }
}
