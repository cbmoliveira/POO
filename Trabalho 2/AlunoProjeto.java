/**
 *
 * @author Cassia Oliveira
 */
public class AlunoProjeto extends Aluno {
    
    private String area;
    private double valor;
    
    public AlunoProjeto(){
        super();
    }
    
    public AlunoProjeto(String area, double valor, String nome, int matricula, int periodo){
        super(nome,matricula,periodo);
        this.area = area;
        this.valor = valor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) throws StringNegativaException {
        if (area == null || area.isBlank()) {
            throw new StringNegativaException();
        }
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorNegativoException {
        if (valor <= 0){
            throw new ValorNegativoException();
        }
        this.valor = valor;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Area: "+area);
        System.out.println("Valor: "+valor);
    }
    
}
