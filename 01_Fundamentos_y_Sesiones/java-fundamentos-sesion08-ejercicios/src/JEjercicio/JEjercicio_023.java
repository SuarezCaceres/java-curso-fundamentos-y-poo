
package JEjercicio;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio_023 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int i,cant,num;
        System.out.println("INGRESE CANTIDAD DE NUMEROS ESTEROS POSTIVOS");
        cant=intro.nextInt();
        System.out.println("NUMEROS PARES");
        for(i=1,num=cant;i<=num;i++){
            if(i%2==0){
                System.out.println(""+i);
            }
    }
    }  
}
