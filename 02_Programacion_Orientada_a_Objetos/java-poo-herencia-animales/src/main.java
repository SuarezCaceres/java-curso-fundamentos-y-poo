

/**
 *
 * @author USER
 */
public class main {

    public static void main(String[] args) {
        
        
        Caballo ani1 = new Caballo("afro","galope", 45, "u121");
        Leon ani2 = new Leon(75.5,"NO","tiger", 30, "u126");

        System.out.println("***************************************************************************");
        System.out.println("------"+ani1.getNombre()+"--------" );
        System.out.println("------"+ani1.getDueño()+"--------" );
        ani1.camina();
        ani1.saltar();
        Caballo.correr();
        System.out.println("SU CODIGO ES :    "+ani1.getCodigo());
        System.out.println("SU EDAD ES  :  " +ani1.getEdad());
        
        
        
        
        System.out.println("***************************************************************************");        
        System.out.println("------"+ani2.getNombre()+"--------" );
        System.out.println("------"+ani2.getCrias()+"--------" );
        ani2.camina();
        ani2.comer();
        System.out.println("SU CODIGO ES :    "+ani2.getCodigo());
        System.out.println("SU EDAD  ES :    "+ani2.getEdad());
        System.out.println("SU PESO ACTUAL ES DE :    "+ani2.getPeso());
        System.out.println("***************************************************************************");
    }

    
}
