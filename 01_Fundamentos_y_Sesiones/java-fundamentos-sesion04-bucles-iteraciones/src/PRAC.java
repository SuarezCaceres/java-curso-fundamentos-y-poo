
import java.util.Scanner;



/**
 *
 * @author USER
 */
public class PRAC {
    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        int not;
        String msj="";
        System.out.println("INGRESE NOTA PROMEDIO DEL ESTUDIANTE: ");
        not=intro.nextInt();
        switch(not){
            case 1,2,3,4,5,6,7,8,9,10,11:
                msj="DESAPROBADO, sigue intentando";
                break;
            case 12,13,14,15,16:
            msj="YA CASI TU PUEDES ..... Vamos!!!..";
            break;
            default:
            msj="NO TE HAGAS EL COJUDO QUE ESA NOTA NO EXISTE..";
        }
        System.out.println("SALISTE : "+msj);
    }
}
