
package JPackSesion02;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NewClass1 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int pote;
        double num,rai,po;
        System.out.println("ingrese valor:");
        num=intro.nextDouble();
        System.out.println("ingrese valro a elevar");
        pote=intro.nextInt();
        rai=Math.sqrt(num);
        //Math.abs es para convertir en valor absoluto a un numero
        po=Math.pow(num, pote);
        System.out.println("vlaor de la raiz : "+rai);
        System.out.println("vlaor de la potencia : "+(int)po);
    }
    
}
