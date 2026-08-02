
/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        animal ani1 = new animal("gato", "naranja", 10, 15, true);
        animal ani2 = new animal("gato"," rojo", 10, 15, true);
        System.out.println("el nombre del animal es : "+ani1.getNombre());
        System.out.println("el nombre del segundo animal es : "+ani2.getNombre());
        System.out.println("el color del primer animal es : "+ani1.getColor());
        System.out.println("el color del segundo animal es : "+ani2.getColor());
    }
}
