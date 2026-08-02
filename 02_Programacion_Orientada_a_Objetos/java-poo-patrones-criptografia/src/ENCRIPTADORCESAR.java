
import interfaces.encriptar.IENCRIPTADOR;


/**
 *
 * @author USER
 */
public class ENCRIPTADORCESAR implements IENCRIPTADOR{
public final int shift;
    public ENCRIPTADORCESAR(int shift) {
        this.shift = shift;
    }
    @Override
    public String encriptar(String datoSinEncriptar) {
       StringBuilder encrypted = new StringBuilder();
        for (char c : datoSinEncriptar.toCharArray()) {
            encrypted.append((char) (c + shift));
        }
        return encrypted.toString(); 
    }
    public String desincriptar(String datoEncriptado) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : datoEncriptado.toCharArray()) {
            decrypted.append((char) (c - shift));
        }
        return decrypted.toString();
    }
}
