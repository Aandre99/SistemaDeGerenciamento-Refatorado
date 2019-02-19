
package sistemadegerenciamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract class Pessoa {
    
    Scanner Ler = new Scanner(System.in);
    
    private String nome;
    private String email;
    private int nivelUniversitario;
    private String contato;
    
    private ArrayList<Projeto> projetosDePesquisa;
    private ArrayList<Publicacao> publicacoes;
    

    public Pessoa(){
        this.nome = null;
        this.email = null;
        this.nivelUniversitario = 0;
        this.contato = null;
        this.projetosDePesquisa = new ArrayList<>();
        this.publicacoes = new ArrayList<>();
    }
    
    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacao publicacao) {
        this.publicacoes.add(publicacao);
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Projeto> getProjetosDePesquisa() {
        return projetosDePesquisa;
    }
    public int getNivelUniversitario() {
        return nivelUniversitario;
    }
    public String getContato() {
        return contato;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNivelUniversitario(int nivelUniversitario) {
        this.nivelUniversitario = nivelUniversitario;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public void setProjetosDePesquisa(Projeto projetosDePesquisa) {
        this.projetosDePesquisa.add(projetosDePesquisa);
    }
    
    public void MostrarPessoa(){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Contato: " + this.getContato());
        System.out.println("Nivel Universitario: " + this.nivelUniversitario);
        System.out.println("\nHistorico de Projetos: ");
        for(Projeto projeto : this.projetosDePesquisa){
            
            if(!projeto.getTitulo().equals("Em andamento")){
                System.out.println("Titulo: " + projeto.getTitulo());
            }
        }
        
        System.out.println("Lista de Projeto 'Em andamento': ");
        
        Collections.sort(this.projetosDePesquisa);
        
        for(Projeto projeto : this.projetosDePesquisa){
            
            if(projeto.getTitulo().equals("Em andamento")){
                System.out.println("Titulo: " + projeto.getTitulo());
            }
        }
        
        System.out.println("\nLista de publicações associadas: ");
        Collections.sort(this.publicacoes);
        
        for(Publicacao pub : this.publicacoes){
            System.out.println("Titulo da Publicação: " + pub.getTituloPublicacao());
        }
        System.out.print("\n");
    }
    public void CadastrarPessoa(){
        
         String informacao;
        
        Professor novoProfessor = new Professor();
        
        System.out.println("Informe os seguintes topicos: ");
        System.out.println("Nome: ");
        informacao = Ler.nextLine();
        this.nome = informacao;
        System.out.println("E-mail: ");
        informacao = Ler.nextLine();
        this.email = informacao;
        System.out.println("Contato: ");
        informacao = Ler.nextLine();
        this.contato = informacao;
    }
}
