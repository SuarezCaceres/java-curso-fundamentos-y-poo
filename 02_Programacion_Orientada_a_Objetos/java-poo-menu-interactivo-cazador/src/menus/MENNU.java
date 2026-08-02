
package menus;

import java.util.Scanner;


public class MENNU {
    
    public static void main(String[] args) {
        int op;
        Scanner lee = new Scanner (System.in);
        do{
        do{
            System.out.println("1. buenos dias ");
            System.out.println("2. buenas tardes ");
            System.out.println("3. buenas noches");
            System.out.println("4. salir");
            op= lee.nextInt();
        }while(op<1 || op>4); 
        switch(op){
            case 1:
                int opper;
                //do{
                do{
                    System.out.println("buenos dias mi extimado");
                    System.out.println("que le parecio el dia de hoy");
                    

                    System.out.println("***********************************");
                    System.out.println( "1."+  "    ESTUVO BUENO EL CLIMA");
                    System.out.println( "2" + "    ESTUVO MALO EL CLIMA");
                    System.out.println( "3" + "    NORMAL COMO SIEMPRE");
                    System.out.println( "4" + "    VOLVER AL MENU ANTERIOR");
                    opper=lee.nextInt();
                     //}while(opper<=3 & opper>=1);
                    // mhasta aca todo bien
                
                switch(opper){
                    case 1:                 
                        System.out.println("ESTUVO BUENO EL CLIMA");
                        break;
                    case 2:                 
                        System.out.println("ESTUVO MALO EL CLIMA");
                        break;
                    case 3:                 
                        
                        System.out.println("NORMAL COMO SIEMPRE");
                   //}while(op!=4);
                        
                        
                        
                    default :
                        System.out.println("*************************");
                        System.out.println(" OPCION INVALIDA ");
                        System.out.println("*************************");
                }
                   }while(opper<=3 & opper>=1);
                                      
                    
                
        
              // }while();
//}while(op==4);
                //
                break;
            case 2:
                System.out.println("buenos tardes mi extimado");
                break;
            case 3:
                System.out.println("buenos noches mi extimado");
                break;
            case 4:
                System.out.println("usd ha salido del programa gracias :) ");
                System.out.println("---------------hasta luego -----------------");
                System.out.println("------------------------------------------------");
                System.exit(0);
                break;
        }
        }while(op!=4);    
                lee.close();
    }
}
