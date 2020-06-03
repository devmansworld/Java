
package Libreria;


public class TryParse {
    public boolean esEntero(String cnumero) {
        try {
            int numero = Integer.valueOf(cnumero);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
