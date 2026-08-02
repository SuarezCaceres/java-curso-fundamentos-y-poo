
import java.util.Scanner;



/**
 *
 * @author USER
 */
public class PRAC2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int n1,n2,n3,n4,nm,prom;
        String msj="";
        System.out.println("INGRESE N1");
        n1=intro.nextInt();
        System.out.println("INGRESE N2");
        n2=intro.nextInt();
        System.out.println("INGRESE N3");
        n3=intro.nextInt();
        System.out.println("INGRESE N4");
        n4=intro.nextInt();
        nm=n1;
        if(n2<nm){
            nm=n2;
        }
        if (n3<nm){
        nm=n3;
        }
        if (n4<nm){
        nm=n4;
        }
        prom=(n1+n2+n3+n4-nm)/3;
        switch (prom){
            case 1,2,3,4,5,6,7,8,9,10,11:
                msj="NECESITAS ESTUDIAR";
                break;
            case 12,13,14,15,16:
                msj="NECESITAS MEJORAR";
                break;
            case 17,18:
                msj="TE FALTA SOLO UN POQUITO MAS";
                break;
            case 19,20:
                msj="LO LOGRASTE FELICIDADES";
                break;
            default:
                msj="NO TE HAGAS EL PENDEJO, ESCRIBE BIEN TUS NOTAS";
        }
        System.out.println("EL PROMEDIO DE TU NOTA ES DE : "+prom +" "+msj);
    }
}
