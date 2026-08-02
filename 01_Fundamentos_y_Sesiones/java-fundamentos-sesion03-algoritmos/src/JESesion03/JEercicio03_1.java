
package JESesion03;

import java.util.Scanner;

/**
 *
 * @author SUAREZ CACERES SERGIO
 */
public class JEercicio03_1 {
    public static void main(String[] args) {
        Scanner intro=new Scanner (System.in);
        //int a=10, b=0;
        int a,b;
        System.out.println("INGRESE PRIMER NUMERO");
        a=intro.nextInt();
        System.out.println("INGRESE SEGUNDO NUMERO");
        b=intro.nextInt();
        boolean aEsMayor = (a>b);
        if(b!=0 && a%b==0){
            System.out.println(b+" ES UN FACTOR DE "+a);
        
            System.out.println(a+" es mayor "+b+aEsMayor);
            System.out.println(a+" es menor "+b+!aEsMayor);
            
        }
    }
    
}
