
import java.util.Scanner;



/**
 *
 * @author LAB-USR-SJL
 */
public class JEjercicio02 {
    public static void main(String[] args) {
        Scanner intro =new Scanner (System.in);
        int n1,n2,n3,n4,prom,nm;
        String msj="";
        System.out.println("INGRESE NOTA 01 :");
        n1=intro.nextInt();
        System.out.println("INGRESE NOTA 02 :");
        n2=intro.nextInt();
        System.out.println("INGRESE NOTA 03 :");
        n3=intro.nextInt();
        System.out.println("INGRESE NOTA 04 :");
        n4=intro.nextInt();
        nm=n1;
        if(n2<nm){
            nm=n2;
        }
        if(n2<nm){
            nm=n3;
        }
        if(n4<nm){
            nm=n4;
        }
        prom=((n1+n2+n3+n4)-nm)/3;
        switch(prom){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                msj= "reforzamineto inmediato ....";
                break;
            case 11:
            case 12:
            case 13:
                msj ="en proceso ...";
            break;
            case 14:
            case 15:
            case 16:
                msj="en mejora....";
            break;
            case 17:
            case 18:
                msj="por alcanzar objetivo";
                break;
            case 19 :
            case 20:
                msj ="objetivo logrado";
                break;
        }
       System.out.println("prom obtenido :" +prom);
       System.out.println("ud esta en :" +msj);   
      
    }
    
}
