
package JESesion03;

import java.util.Scanner;

/**
 *APLICATIVO QUE DETERMINA EL MONTO A 
 * PAGAR POR VARIOS ARTICULOS DEL MISMO PRECIO, 
 * AL CUAL SE LE APLICA EL IGV Y UN DESCUENTO DEL 7%
 * MOSTRAR EL SUBTOTAL, EL DESCUENTO, EL IMPUESTO Y EL MONTO A PAGAR.
 * @author USER
 */
public class PC02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int art;
        double imp,pre,igv=0.18,dsc,sub,tp;
        System.out.println("INGRESE CANTIDAD DE ARTICULOS");
        art=intro.nextInt();
        System.out.println("INGRESE PRECIO DEL PRODUCTO");
        pre=intro.nextDouble();
        sub=pre*art;
        imp=sub*igv;
        dsc=(igv+sub)*0.07;
        tp=sub+igv-dsc;
        System.out.println("EL SUBTOTAL ES : "+(int)+sub);
        System.out.println("EL IGV APLICADO ES DE : "+(int)+imp);
        System.out.println("EL DESCUENTO APLICADO ES DE : "+(int)+dsc);
        System.out.println("TOTAL A PAGAR ES DE : "+(int)+tp);
    }
    
}
