package sistemadegerenciamento;

import java.util.ArrayList;
import java.util.Collections;
import static sistemadegerenciamento.ControleDoSistema.Ler;

public class Aluno extends Pessoa{
   
    private ArrayList<Professor> Orientadores;
    private int quantidadeEmAndamento;
    
    public Aluno(){
        super();
        Orientadores = new ArrayList<>();
        this.quantidadeEmAndamento = 2;
    }
    public ArrayList<Professor> getOrientadores() {
        return Orientadores;
    }
    public int getQuantidadeEmAndamento() {
        return quantidadeEmAndamento;
    }
    public void setOrientadores(Professor Orientadore) {
        this.Orientadores.add(Orientadore);
    }
    public void setQuantidadeEmAndamento() {
        this.quantidadeEmAndamento+= 1 ;
    }
    public void setDiminuirQuantidadeEmAndamento(){
        this.quantidadeEmAndamento-= 1;
    }

    @Override
    public void MostrarPessoa(){
        
        System.out.println("Informações do Aluno: ");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Contato: " + super.getContato());
        System.out.println("QTDEMANDAMENTO: " + this.quantidadeEmAndamento);
        System.out.println("Nivel Universitário: " + super.getNivelUniversitario());
        
        System.out.println("\nHistorico de Projetos: \n");
        Collections.sort(this.getProjetosDePesquisa());
        
        for(Projeto proj : this.getProjetosDePesquisa()){
            System.out.println("Titulo: " + proj.getTitulo());
            System.out.println("Descrição: " + proj.getDescricao());
        }
        Collections.sort(this.getPublicacoes());
        
        System.out.println("\nProdução Acadêmica:\n ");
        for(Publicacao pub : this.getPublicacoes()){
            System.out.println("Titulo: " + pub.getTituloPublicacao());
            System.out.println("Conferência: " + pub.getNomeConferencia());
        }
    }
    @Override
    public void CadastrarPessoa(){
        
        String informacao;
        int info = 0;
        Professor novoProfessor = new Professor();
        
        System.out.println("Informe os seguintes topicos: ");
        System.out.println("Nome: ");
        informacao = Ler.nextLine();
        super.setNome(informacao);
        System.out.println("E-mail: ");
        informacao = Ler.nextLine();
        super.setEmail(informacao);
        System.out.println("Contato: ");
        informacao = Ler.nextLine();
        super.setContato(informacao);
        System.out.println("Nivel Universitario\n");
        System.out.println("1 - Graduação;");
        System.out.println("2 - Mestrado;");
        System.out.println("3 - Doutorado.\n");
        info = Ler.nextInt();Ler.nextLine();
        super.setNivelUniversitario(info);
        
    }
}
