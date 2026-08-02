
package JESesion03;

import java.util.Scanner;

/**
 *
 * @author suarez caceres
 * calkcular el monto a pagra por una cierta cant de articulos sabiendo 
 * que si el sub total de compra es mayor que 200 soles  o l a cant es mayor que 20 este sufre un desc del 5%
 * calcular y mostra el subtotal, desc y cant a pagar a la vez indicar si se obtuvo desc 
 * 
 */
public class JESesion03_02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int cant;
        double sub,montp,pre,desct,igv;
        String msj="";
        System.out.println("INGRESE CANT DE ARTICULO :");
        cant=intro.nextInt();
        System.out.println("INGRESE PRECIO :");
        pre=intro.nextDouble();
        sub=cant*pre;
        igv=sub*0.18;
        desct=0;
        if (sub>200||cant>20){
            desct=sub*0.05;
        }
        boolean descuento=(desct>0);
        boolean SI=true;
        boolean NO=false;
        if (descuento==SI){
            msj="SI";
        }else{
            msj="NO";
        }
        sub=sub-desct;
        montp=sub+igv;
        System.out.println("EL PRECIO TOTAL DE LA COMPRA ES : $/"+montp);
        System.out.println("EL descuento DE LA COMPRA ES : $/"+desct);
        System.out.println("SE APLICO EL DESCUETNO : "+descuento);
        System.out.println("OBTUVO EL DESCUENTO : "+msj);
        
    }
    
}
