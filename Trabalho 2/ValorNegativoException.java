/**
 *
 * @author Cassia Oliveira
 */
public class ValorNegativoException extends Exception {
    
    public ValorNegativoException(){
        super("Esta operação não aceita valores menores ou iguais a zero.");
    }
    
}
