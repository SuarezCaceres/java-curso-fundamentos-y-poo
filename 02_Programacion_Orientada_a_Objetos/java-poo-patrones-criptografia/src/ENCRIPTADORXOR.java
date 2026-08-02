
import interfaces.encriptar.IENCRIPTADOR;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class ENCRIPTADORXOR implements IENCRIPTADOR {
   public final char clave;

    public ENCRIPTADORXOR(char clave) {
        this.clave = clave;
    }

    @Override
    public String encriptar(String datoSinEncriptar) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : datoSinEncriptar.toCharArray()) {
            encrypted.append((char) (c ^ clave));
        }
        return encrypted.toString();
    }

    @Override
    public String desincriptar(String datoEncriptado) {
        return encriptar(datoEncriptado);
    }

    @Override
    public String desencriptar(String DatoEncriptado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
