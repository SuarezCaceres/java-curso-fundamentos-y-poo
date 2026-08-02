
package JEjercicios_repetitivo;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio04 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int opcion=0;
        int not1=0,not2=0,not3=0,cant=0;
        double prom;//promg=0;
        int i=1;
        System.out.println("INGRESE CANTIDAD DE ESTUDIANTES");
                cant=intro.nextInt();
                while(i<=cant){
                 String menu ="""
                     |*-*-*-*-*-*-**-*-*-*-*-**|
                     |ELIJA LA OPCION ENTRE (1-3)*-*|
                     |[1] AGREGAR NOTAS (00-20)|*-*-|
                     |[2]VISULIZAR PROMEDIO*-*-*-*-*|
                     |[3]VISULIZAR PROM X EST*-*-*-*|
                     |[4]PROM GENERAL -*-*-*-*-*-*-*|
                     ||5]SALIR*-*-*-*-*-*-*-*-*-*-*-|
                     """;
        do{
            System.out.println(menu);
            opcion=intro.nextInt();
            if (opcion==1){
                do{
                    System.out.println("ESTUDIANTE N° "+i++);
                    System.out.println("INGRESE NOTA 01");
            not1=intro.nextInt();
            if(not1<0 || not1>20){
                    System.out.println("error......");
            }    
                }while(not1<0 || not1>20);
                do{
                    System.out.println("INGRESE NOTA 02");
            not2=intro.nextInt();
            if(not2<0 || not2>20){
                    System.out.println("error......");
            }    
                }while(not2<0 || not2>20);
                do{
                    System.out.println("INGRESE NOTA 03");
            not3=intro.nextInt();
            if(not3<0 || not3>20){
                    System.out.println("error......");
            }    
                }while(not3<0 || not3>20);
    }
            prom =(not1+not2+not3)/3;
            System.out.println("*-*-*-*-*-*-*-*-*--*-"+i);
            if(opcion==2){
                System.out.println("EL PROMEDIO ES : "+prom +" del estudiante : ");
            }
            //if(opcion ==3){
              //  while(i<=cant){
                //promg=promg+prom;
            //}
            //}
    }while(opcion!=5);
    }   
 }
}
