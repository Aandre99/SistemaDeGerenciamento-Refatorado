package sistemadegerenciamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Publicacao implements Comparable<Publicacao> {
    
    Scanner ler = new Scanner(System.in);
    
    private ArrayList<Pessoa> Autores;
    private ArrayList<Projeto> projetosAssociados;
    private String tituloPublicacao;
    private String nomeConferencia;
    private int anoPublicacao;
 
    public Publicacao(){
        this.tituloPublicacao = null;
        this.nomeConferencia = null;
        this.Autores = new ArrayList<>();
        this.projetosAssociados = new ArrayList<>();
    }

    public ArrayList<Pessoa> getAutores() {
        return Autores;
    }

    public ArrayList<Projeto> getProjetosAssociados() {
        return projetosAssociados;
    }

    public String getTituloPublicacao() {
        return tituloPublicacao;
    }

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
   
    public void setAutores(Pessoa Autores) {
        this.Autores.add(Autores);
    }
    public void setProjetosAssociados(Projeto novoProjeto) {
        this.projetosAssociados.add(novoProjeto);
    }
    public void setTituloPublicacao(String tituloPublicacao) {
        this.tituloPublicacao = tituloPublicacao;
    }
    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public void MostrarPublicacao()
    {
        System.out.println("Titulo: " + this.tituloPublicacao);
        System.out.println("Conferencia: " + this.nomeConferencia);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
        
        System.out.println("Autores: ");
        for(Pessoa autor : this.Autores){
            System.out.println(autor.getNome());
        }
        if(this.projetosAssociados.size() > 0)
        {
            System.out.println("Projetos Associados: \n");
            for(Projeto projeto : this.projetosAssociados){
                System.out.println(projeto.getTitulo());
                System.out.println(projeto.getDescricao());
            }
        }
    }

    @Override
    public int compareTo(Publicacao pub) {
    
        if(this.anoPublicacao > pub.getAnoPublicacao()){
            return -1;
        }
        if(this.anoPublicacao < pub.getAnoPublicacao()){
            return 1;
        }
        return 0;
    }
}
