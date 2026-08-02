
package REPASO;

import java.util.Scanner;

/**
 *
 * @author USER suarez caceres
 */
public class PROBLEMA01 {
    public static void main(String[] args) {
        Scanner intro=new Scanner (System.in);
        String cat;
        String msj="";
        double vent,mp,sueldo,comi,comision;
        System.out.println("INGRESE CATEGORIA ");
        cat=intro.nextLine();
        System.out.println("INGRESE VENTAS ");
        vent=intro.nextDouble();
        switch (cat){
                case "a","A":
                sueldo=400;
                break;
                case "b","B":
                sueldo=500;
                break;
                case "c","C":
                sueldo=600;
                break;
                case "d","D":
                sueldo=700;
                break;
                default:
                sueldo=0;
        }
        if (vent>0 && vent<=500){
            comi=0*vent;
        }else
            if(vent>=501 && vent<=1500){
                comi=0.205*vent;
            }else{
                if(vent>=1501 && vent<=2500){
                    comi=0.305*vent;
                }else{
                    if(vent>2500){
                        comi=0.455*vent;
                    }else{
                        msj="error";
                    }
                }    
            }
        mp=sueldo+comi;
        System.out.println("la comision es de : "+comi);
        System.out.println("el total : " +mp);
    }
}
