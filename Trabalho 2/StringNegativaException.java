/**
 *
 * @author Cassia Oliveira
 */
public class StringNegativaException extends Exception {
    
    public StringNegativaException(){
        super("Esta operação não aceita valores nulos ou vazios.");
    }
    
}
