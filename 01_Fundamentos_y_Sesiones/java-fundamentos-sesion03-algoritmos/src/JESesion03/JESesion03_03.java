
package JESesion03;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 * calkcular el monto a pagra por una cierta cant de articulos sabiendo 
 * que si el sub total de compra es mayor que 200 soles  o l a cant es mayor que 20 este sufre un desc del 5% (sino del 2 %)
 * calcular y mostra el subtotal, desc y cant a pagar a la vez indicar si se obtuvo desc 
 */
public class JESesion03_03 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int cant;
        double sub,montp,pre,desct,igv;
        System.out.println("INGRESE CANT DE ARTICULO :");
        cant=intro.nextInt();
        System.out.println("INGRESE PRECIO :");
        pre=intro.nextDouble();
        sub=cant*pre;
        igv=sub*0.18;
        if (sub>200||cant>20){
            desct=sub*0.05;
        }else{
            desct=sub*0.02;
        }
        sub=sub-desct;
        montp=sub+igv;
        System.out.println("EL PRECIO TOTAL DE LA COMPRA ES : $/"+montp);
        System.out.println("EL descuento DE LA COMPRA ES : $/"+desct);
        System.out.println("OBTUVO DESCUENTO :"+desct);
    }
    }
