
package JPackSesion02;

import java.util.Scanner;

/**
 *
 * @author SUAREZ CACERES SERGIO MATEO
 * APLICATIVO QUE DETERMINA EL MONTO A PAGAR POR VARIOS ARTICULOS DEL MISMO PRECIO, AL CUAL SE LE APLICA EL IGV Y UN DESCUENTO DEL 7%
 * MOSTRAR EL SUBTOTAL, EL DESCUENTO, EL IMPUESTO Y EL MONTO A PAGAR.
 */
public class JEjercicio01 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int cant;
        double prec,imp,dscto,subtotal,mpagar;
        double igv=0.18,pdscto=0.07;
        System.out.println("----------------------------");
        System.out.println("INGRESE CANTIDAD DE PRODUCTOS: ");
        cant=intro.nextInt();
        System.out.println("INGRESE PRECIO DEL ARTICULO: ");
        prec=intro.nextDouble();
        subtotal= cant*prec;
        imp=subtotal*igv;
        dscto=subtotal*pdscto;
        mpagar=subtotal+imp-dscto;
        System.out.println("*-*-*-*-*BOLETA DE PAGO*-*-*-*-*");
        System.out.println("-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*");
        System.out.println("SUBTOTAL: S/"+subtotal+ " REDONDEADO :" +(int)subtotal);
        System.out.println("IGV: S/"+(int)imp);
        System.out.println("DESCUENTO: S/"+(int)dscto);
        System.out.println("TOTAL A PAGAR: S/"+(int)mpagar);
        System.out.println("GRACIAS POR SU COMPRA");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-**-*");
    }
    
}
