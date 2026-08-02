
package JEJERCICIOS_REPETITIVOS;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-SJL
 */
public class ejercicio_repetitivo04 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int i,est;
        double n1,n2,n3,prom,sumprom=0,promg=0;
        i=1;
        System.out.println("ingrese cant de estudiante:");
        est=intro.nextInt();
        while(i<=est){
            System.out.println("estudiante n°: "+i);
            System.out.println("ingrese nota 01:");
            n1=intro.nextDouble();
            //condicional if else no sirbve en esta parte
            while (n1<0 || n1>20){
                System.out.println("NOOOOOOOOOO.... ERROR ...");
            System.out.println("ingrese nota 01:");
            n1=intro.nextDouble();
            }
            System.out.println("ingrese nota 02:");
            n2=intro.nextDouble();
            System.out.println("ingrese nota 03:");
            n3=intro.nextDouble();
            prom=(n1+n2+n3)/3;
            System.out.println("promedio estudiante :"+i+" : "+prom);
            sumprom=prom+sumprom;//acumulador
            promg=sumprom/est;
            i++;//contador
            }
        System.out.println("PROMDEDIO GENERAL : "+promg);
        }
    } 
