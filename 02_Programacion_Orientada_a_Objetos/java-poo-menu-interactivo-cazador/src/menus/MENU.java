
package menus;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MENU {
    public static void main(String[] args) {
            int opcion;
            Scanner leer = new Scanner (System.in);
        do{
            do{
            System.out.println("1. buenos dias ");    
            System.out.println("2. buenos tardes ");    
            System.out.println("3. buenos noches ");    
            System.out.println("4. SALIR ");
            System.out.println("ELIJA UNA OPCION ");
            opcion =leer.nextInt();
        }while(opcion<1 || opcion >4);
        switch(opcion){
            case 1:
                System.out.println("BUENOS DIAS MI ESTIMADO ");
                break;
            case 2:
                System.out.println("BUENOS TARDES MI ESTIMADO ");
                break;
            case 3:
                System.out.println("BUENOS NOCHES MI ESTIMADO ");
                break;
            case 4:
                System.out.println("USD SALIO DEL PROGRAMA "); 
                System.exit(0);              
                break;
        }
    }while(opcion !=4);
    }
}
