
package JPackSesion02;

import java.util.Scanner;

/**
 *
 * @author SUAREZ CACERES SERGIO MATEO
 */
public class JEjercicio02 {
    public static void main(String[] args) {
        Scanner intro=new Scanner (System.in);
        double num,raiz,pot;
        int vpot;
        System.out.println("INGRESE NUMERO :");
        num=intro.nextInt();
        //Math.abs(num);
        System.out.println("INGRES VALOR DE LA POTENCIA :");
        vpot=intro.nextInt();
        raiz=Math.sqrt(Math.abs(num));
        pot=Math.pow(num,vpot);
        System.out.println("RAIZ CUADRADA DE "+Math.abs(num)+" ES:"+raiz);
        System.out.println("NUMERO ELEVADO A LA POTENCIA :"+vpot+" ES :"+pot);
    }
}
