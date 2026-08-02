
package REPASO;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PROBLEMA03 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        double max,n1,n2,n3,min;
        System.out.println("INGRESE NUMERO :");
        n1=intro.nextDouble();
        System.out.println("INGRESE NUMERO :");
        n2=intro.nextDouble();
        System.out.println("INGRESE NUMERO :");
        n3=intro.nextDouble();
        if(n1!=n2 && n1!=n3 && n2!=n3){
            System.out.println("LOS NUMEROS INGRESADOS SIN DIFERENTES BIEN");
        }else{
            System.out.println("LOS NUMEROS NO SON DIFERENTES INTENTALO NUEVAMENTE");
        }
        max=Math.max(Math.max(n1, n2), n3);
        min=Math.min(Math.min(n1, n2), n3);
        System.out.println("EL NUMERO MAXIMO SERA : "+max);
        System.out.println("EL NUMERO MiniMO SERA : "+min);        
    }
    
}
