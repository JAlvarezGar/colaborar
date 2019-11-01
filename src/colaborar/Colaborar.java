package colaborar;

/**
 *
 * @author jesus
 */
public class Colaborar {

    public static final int NUMERO_INSTANCIAS = 10;

    public static void main(String[] args) {

        int numeroInstancias = 0;
        if (args.length > 0) {

            numeroInstancias = Integer.parseInt(args[0]);

        }
        else{
        
            numeroInstancias=NUMERO_INSTANCIAS;
        }
    }

}
