
package JESesion03;

import java.util.Scanner;

/**
 *
 * @author SUAREZ  CACERES  SERGIO
 * desarrolle un aplicativo en java qeu permita ingresar una cierta cant de 
 * productos si la cant es menor de 5 este no aplica descuento 
 * ,si la cant esta entre 5 yu menor de 10 tiene un descuento del 2% , si
 * la cantida esta entre 10 y meor de 15 tiene un descuento del 5%, si
 * la cantiodad es de 15 a mas tiene un descuento del 8%
 * a la vez  si la compra total aplicado descuento es mayor a 1000 este 
 * obtiene un bono de s/20.00 estra en el pago de la compra , pero si esta entre $/1500 y $/2000 solo tiemne 
 * un bono de $/ 5.00 extra en el pago de la compra 
 * calcular y motrar el subtotal, descuento , el pago total de toda la compra.
 */
public class JESesion03_3 {
    public static void main(String[] args) {
        Scanner intro =new Scanner (System.in);
        int cant;
        double pre,sub,dsc,mcomp,BONO,tp;
        //double bono1=20,bono2=5;
        System.out.println("INGRESE CANTIDAD DE PRODUCTO :");
        cant=intro.nextInt();
        System.out.println("INGRESE PRECIO DEL PRODUCTO :");
        pre=intro.nextInt();
        sub=cant*pre;
        if (cant<5){
            dsc=sub*0;
        }else{
            if(cant>=5 && cant<10){
                dsc=sub*0.02;
            }else{
                if(cant>=10 && cant<15){
                    dsc=sub*0.05;
                }else{
                    dsc=sub*0.08;
                }
            }
        }
        mcomp=sub-dsc;
        if(mcomp<2000){
            BONO=20;
        }else{
            if (mcomp>=1500 && mcomp>=2000){
                BONO=5;
            }else{
                BONO=0;
            }
        }
        tp=mcomp-BONO;
        System.out.println("SUBTOTAL : S/"+sub);
        System.out.println("DESCUENTO : S/"+dsc);
        System.out.println("BONO SOBRE EL TOTAL : S/"+BONO);
        System.out.println("TOTAL A PAGAR : S/"+tp);
    }
    
}
