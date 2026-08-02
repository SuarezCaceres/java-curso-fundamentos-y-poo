
package JPackSesion02;

import java.util.Scanner;

/**
 *
 * @author USER SUAREZ CACERES SERGIO MATEO
 */
public class PC01 {
    public static void main(String[] args){
        Scanner intro =new Scanner (System.in);
        double num,raiz;
        int pot,potencia;
        System.out.println("*-**-*-*-*-*-*-*-*");
        System.out.println("INGRESE NUMERO :");
        num=intro.nextInt();
        System.out.println("INGRESE VALOR DE POTENCIA A ELEVAR :");
        pot=intro.nextInt();
        raiz=Math.sqrt(Math.abs(num));
        potencia=(int)Math.pow(num,pot);
        System.out.println("EL VALOR DE LA RAIZ DE " +Math.abs(num)+" ES :"+raiz);
        System.out.println("EL VALRO DE LA POTENCIA DE "+Math.abs(num)+" ES :"+potencia);
    }
}
