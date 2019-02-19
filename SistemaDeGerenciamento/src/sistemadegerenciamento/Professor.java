package sistemadegerenciamento;

import java.util.ArrayList;
import java.util.Collections;

public class Professor extends Pessoa{
    
    private ArrayList <Aluno> orientacoes;
    
    public Professor(){
        super();
        this.orientacoes = new ArrayList<>();
    }

    public ArrayList <Aluno> getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(Aluno orientado) {
        this.orientacoes.add(orientado);
    }
    
    public void MostrarPessoa(){
        
        System.out.println("Informações do Professor: ");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Contato: " + super.getContato());
       
        System.out.println("\nHistorico de Projetos: \n");
        Collections.sort(this.getProjetosDePesquisa());
        
        for(Projeto proj : this.getProjetosDePesquisa()){
            System.out.println("Titulo: " + proj.getTitulo());
            System.out.println("Descrição: " + proj.getDescricao());
        }
        Collections.sort(this.getPublicacoes());
        
        System.out.println("Produção Acadêmica:\n ");
        for(Publicacao pub : this.getPublicacoes()){
            System.out.println("Titulo: " + pub.getTituloPublicacao());
            System.out.println("Conferência: " + pub.getNomeConferencia());
        }
        
        System.out.println("Lista de Orientados\n: ");
        for(Aluno aluno : this.orientacoes){
            System.out.println("Nome: " + aluno.getNome());
        }
    }
}
