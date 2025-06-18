
/**
 *
 * @author Cassia Oliveira
 */
public class Aluno {
    
    private String nome;
    private int matricula;
    private int periodo;
    
    public Aluno(){}
    
    public Aluno(String nome, int matricula, int periodo){
    this.nome = nome;
    this.matricula = matricula;
    this.periodo = periodo;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws StringNegativaException {
        if (nome == null || nome.isBlank()) {
            throw new StringNegativaException();
        }
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws ValorNegativoException {
        if (matricula <= 0){
            throw new ValorNegativoException();
        }
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) throws ValorNegativoException {
        if (periodo <= 0){
            throw new ValorNegativoException();
        } 
        this.periodo = periodo;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Período: "+periodo);
    }
    
}
