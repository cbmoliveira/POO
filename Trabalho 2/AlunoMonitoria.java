/**
 *
 * @author Cassia Oliveira
 */
public class AlunoMonitoria extends AlunoProjeto {
    
    private String disciplina;
    
    public AlunoMonitoria(){
        super();
    }
    
    public AlunoMonitoria(String disciplina, String area, double valor, 
            String nome, int matricula, int periodo){
        super(area,valor, nome, matricula, periodo);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) throws StringNegativaException {
        if (disciplina == null || disciplina.isBlank()) {
            throw new StringNegativaException();
        }
        this.disciplina = disciplina;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Disciplina: "+disciplina);
    }
}
