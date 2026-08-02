
import java.util.Scanner;


/**
 *
 * @author SUAREZ CACERES SERGIO
 */
public class Practica_personal {
    public static void main(String[] args) {
        Scanner intro=new Scanner (System.in);
        double c1,c2,c3=15.70,r;
        int d=4;
        String nombre,apellido,mercado;
        String msj;
        msj="los dias de su compra fueron: ";
        System.out.println("INGRESE SU NOMBRE POR FAVOR: ");
        nombre=intro.nextLine();
        System.out.println("INGRESE SU APELLIDO POR FAVOR: ");
        apellido=intro.nextLine();
        System.out.println("INGRESE EL MERCADO AL QUE FUE A COMPRAR: ");
        mercado=intro.nextLine();
        System.out.println("INGRESE COSTO DE LA PRIMERA COMPRA: ");
        c1=intro.nextDouble();
        System.out.println("INGRESE COSTO DE LA SEGUNDA COMPRA: ");
        c2=intro.nextDouble();
        r=(c1+c2+c3)*d;
        System.out.println("LO TOTAL GASTDO EN TODOS LOS DIAS DE COMPRAS ES : "+r);
        System.out.println(msj+d);
        
    }
}
