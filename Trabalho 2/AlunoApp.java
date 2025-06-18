
import java.util.Scanner;

/**
 *
 * @author Cassia Oliveira
 */
public class AlunoApp {

    public static void main(String[] args) throws StringNegativaException, ValorNegativoException {
        
        Scanner teclado = new Scanner(System.in);
        Aluno aluno;
        int matricula, periodo, opcao;
        String nome, area, disciplina, nomeProjeto;
        double valor;
        
        do {
            System.out.println("1 - Cadastrar");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();
                        
            switch (opcao) {
                case 1:
                    System.out.println("2 - Aluno");
                    System.out.println("3 - Aluno Monitoria");
                    System.out.println("4 - Aluno Iniciação Científica");
                    opcao = teclado.nextInt();
                    teclado.nextLine();
                    
                    if (opcao == 2){
                        aluno = new Aluno();
                        System.out.println("Digite nome");
                        aluno.setNome(teclado.nextLine());
                        
                        System.out.println("Digite Matrícula");
                        aluno.setMatricula(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.println("Digite Período");
                        aluno.setPeriodo(teclado.nextInt());
                        teclado.nextLine();
                        
                        aluno.imprimir();
                        
                    }
                    
                    if (opcao == 3){
                        aluno = new AlunoMonitoria();
                        AlunoMonitoria alunoMonitoria = (AlunoMonitoria) aluno;
                        
                        System.out.println("Digite nome");
                        alunoMonitoria.setNome(teclado.nextLine());
                        
                        System.out.println("Digite Matrícula");
                        alunoMonitoria.setMatricula(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.println("Digite Período");
                        alunoMonitoria.setPeriodo(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.println("Digite Area");
                        alunoMonitoria.setArea(teclado.nextLine());
                        
                        System.out.println("Digite Valor");
                        alunoMonitoria.setValor(teclado.nextDouble());
                        teclado.nextLine();
                        
                        System.out.println("Digite Disciplina");
                        alunoMonitoria.setDisciplina(teclado.nextLine());
                        
                        aluno.imprimir();
                                                
                    }
                    
                    if (opcao == 4){
                        aluno = new AlunoIniciacaoCientifica();
                        AlunoIniciacaoCientifica alunoIC = (AlunoIniciacaoCientifica) aluno;
                        
                        System.out.println("Digite nome");
                        alunoIC.setNome(teclado.nextLine());
                        
                        System.out.println("Digite Matrícula");
                        alunoIC.setMatricula(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.println("Digite Período");
                        alunoIC.setPeriodo(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.println("Digite Area");
                        alunoIC.setArea(teclado.nextLine());
                        
                        System.out.println("Digite Valor");
                        alunoIC.setValor(teclado.nextDouble());
                        teclado.nextLine();
                        
                        System.out.println("Nome do Projeto");
                        alunoIC.setNomeProjeto(teclado.nextLine());
                        
                        aluno.imprimir();
                        
                    }
                    
                    break;
                 
                     
                case 0:
                    break;
                    
                default:
                    System.out.println("Opção Inválida!");
                    break;
                     
            }
        } while (opcao != 0);
        
    }
    
}
