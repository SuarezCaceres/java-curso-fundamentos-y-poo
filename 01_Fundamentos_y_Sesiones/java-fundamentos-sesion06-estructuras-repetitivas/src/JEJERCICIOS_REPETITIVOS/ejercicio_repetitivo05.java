
package JEJERCICIOS_REPETITIVOS;

import java.util.Scanner;

/**
 *permita determinar el total a pagra por la compra de varios productos de diferentes tipo y precio 
 * se sabe que cada producto tiene un desc del 3% de su valor real
 * a la compra general se le aplica el impuesto  IGV(18%)
 * mostra la cant de productos comprados ,el subtotal, el desc general,
 * el impuesto calculado (soles)y el valor total de la compra.
 * validar el ingreso de datos
 * 
 * @author LAB-USR-SJL
 */
public class ejercicio_repetitivo05 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int pro;
        String produc;
        double desc,des=0.03,pre,sumpre=0,tp=0,sub,igv=0.18,descg= 0,imp=0,i,sumdesc = 0;
        i=1;
        System.out.println("ingrese cantidad de productos");
        pro=intro.nextInt();
        while (i<=pro){
            System.out.println("producto N° :" +i);
            System.out.println("INGRESE precio del producto ");
            pre=intro.nextDouble();
            System.out.println("Ingrese name del producto ");
            produc=intro.nextLine();
        while (pre<0){
            System.out.println("ERROR INGRE DE NUEVO ");
            System.out.println("INGRESE precio del producto_____");
        pre=intro.nextDouble();
        }
        desc=pre*des;
        sumdesc=desc+sumdesc;
        sumpre=pre+sumpre;
        imp=igv*sumpre;
        tp=sumpre-sumdesc+imp/i;
        i++;
        }
        System.out.println("la cantidad de prodcutos es : "+i);
        System.out.println("precio total del prodcutos es : "+sumpre);
        System.out.println("impuesto total es de : "+imp);
        System.out.println("el descuento total es de "+sumdesc);
        System.out.println("total a pagar es : "+tp);
    }
}
