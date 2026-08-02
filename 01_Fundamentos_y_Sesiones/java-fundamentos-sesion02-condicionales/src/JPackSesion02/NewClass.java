
package JPackSesion02;

import java.util.Scanner;

/**
 *APLICATIVO QUE DETERMINA EL MONTO A PAGAR POR VARIOS ARTICULOS DEL MISMO PRECIO, AL CUAL SE LE APLICA EL IGV Y UN DESCUENTO DEL 7%
 * MOSTRAR EL SUBTOTAL, EL DESCUENTO, EL IMPUESTO Y EL MONTO A PAGAR.
 * @author USER
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int art;
        double sub,dsct,mp,pre;
        double igv=0.18,imp;
        System.out.println("ingrese cant de articlos");
        art=intro.nextInt();
        System.out.println("precio a pagar");
        pre=intro.nextDouble();
        sub=pre*art;
        dsct=sub*0.07;
        imp=sub*igv;
        mp=sub+imp-dsct;
        System.out.println("el subtotal es : "+sub +"  redondeado :"+(int)sub);
        System.out.println("el descuento es : "+dsct +"  redondeado :"+(int)dsct);
        System.out.println("el IGV es : "+imp +"  redondeado :"+(int)imp);
        System.out.println("el monto a pagar es : "+mp+"  redondeado :"+(int)mp);
    }
    
}
