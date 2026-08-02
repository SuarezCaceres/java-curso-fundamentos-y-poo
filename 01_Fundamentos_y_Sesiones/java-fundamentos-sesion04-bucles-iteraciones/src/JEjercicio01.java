
import java.util.Scanner;


/**
 *
 * @author Suarez cACERES
 */
public class JEjercicio01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int estp;
        String msj="";
        System.out.println("INGRESE ESTADO :");
        estp=intro.nextInt();
        switch (estp){
            case 1:
            msj ="creado";
            break;
            case 2:
            msj ="asignado";
            break;
            case 3:
            msj ="en proceso";
            break;
            case 4:
            msj ="finalizado";
            break;
            case 5:
            msj ="cancelado";
            break;
            case 6:
            case 7:
            msj ="suspendido";
            break;
            default:
                msj="no existe este proyecto ";   
        }
        System.out.println("---------> "+msj);
        
    }
    
}
