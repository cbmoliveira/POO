/**
 *
 * @author Cassia Oliveira
 */
public class AlunoIniciacaoCientifica extends AlunoProjeto {
    private String nomeProjeto;
    
    public AlunoIniciacaoCientifica(){
        super();
    }
    
    public AlunoIniciacaoCientifica(String nomeProjeto, String area, 
            double valor, String nome, int matricula, int periodo){
        super(area,valor, nome, matricula, periodo);
        this.nomeProjeto = nomeProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) throws StringNegativaException {
        if (nomeProjeto == null || nomeProjeto.isBlank()) {
            throw new StringNegativaException();
        }
        this.nomeProjeto = nomeProjeto;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nome do Projeto: "+nomeProjeto);
    }
}
