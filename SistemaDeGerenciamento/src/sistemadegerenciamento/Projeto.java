package sistemadegerenciamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Projeto implements Comparable<Projeto> {
    
    public static Scanner Ler = new Scanner(System.in);
    
    private String titulo;
    private String objetivo;
    private String status;
    private String descricao;
    private int diaInicio, mesInicio, anoInicio;
    private int diaTermino,mesTermino,anoTermino;
    private String agenciaFinaciadora;
    private double valorFinanciado;
    private boolean InformacaoCompleta;
    private ArrayList<Aluno> alunosVinculados;
    private ArrayList<Professor> professoresVinculados;
    private ArrayList<Publicacao> publicacoesVinculadas;
    
    public Projeto(){
        this.titulo = null;
        this.descricao = null;
        this.objetivo = null;
        this.status = "Em elaboração";
        this.agenciaFinaciadora = null;
        this.diaInicio = 0;
        this.mesInicio = 0;
        this.anoInicio = 0;
        this.diaTermino = 0;
        this.mesTermino = 0;
        this.anoTermino = 0;
        this.valorFinanciado = 0.0;
        this.InformacaoCompleta = false;
        this.alunosVinculados = new ArrayList<>();
        this.professoresVinculados = new ArrayList<>();
        this.publicacoesVinculadas = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public String getDescricao() {
       return descricao;
    }
    public int getDiaInicio() {
        return diaInicio;
    }
    public int getMesInicio() {
        return mesInicio;
    }
    public int getAnoIncio() {
        return anoInicio;
    }
    public int getDiaTermino() {
        return diaTermino;
    }
    public int getMesTermino() {
        return mesTermino;
    }
    public int getAnoTermino() {
        return anoTermino;
    }
    public String getAgenciaFinaciadora() {
        return agenciaFinaciadora;
    }
    public double getValorFinanciado() {
        return valorFinanciado;
    }
    public ArrayList<Aluno> getAlunosVinculados() {
        return alunosVinculados;
    }
    public ArrayList<Professor> getProfessoresVinculados() {
        return professoresVinculados;
    }
    public String getStatus() {
        return status;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDataInicio(int diaInicio, int mesInicio, int anoInicio) {
        this.diaInicio = diaInicio;
        this.mesInicio = mesInicio;
        this.anoInicio = anoInicio;
    }
    public void setDataTermino(int diaTermino, int mesTermino, int anoTermino) {
        this.diaTermino = diaTermino;
        this.mesTermino = mesTermino;
        this.anoTermino = anoTermino;
    }
    public void setAgenciaFinaciadora(String agenciaFinaciadora) {
        this.agenciaFinaciadora = agenciaFinaciadora;
    }
    public void setValorFinanciado(double valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }
    public void setAlunosVinculados(Aluno novoAluno) {
        this.alunosVinculados.add(novoAluno);
    }
    public void setProfessoresVinculados(Professor novoProfessor) {
        this.professoresVinculados.add(novoProfessor);
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getInformacaoCompleta() {
        return InformacaoCompleta;
    }

    public void setInformacaoCompleta(boolean InformacaoCompleta) {
        
        if( professoresVinculados.size() > 0){
            this.InformacaoCompleta = true;
        }
        else{
            this.InformacaoCompleta = false;
        }
    }

    public ArrayList<Publicacao> getPublicacoesVinculadas() {
        return publicacoesVinculadas;
    }

    public void setPublicacoesVinculadas(Publicacao publicacoesVinculadas) {
        this.publicacoesVinculadas.add(publicacoesVinculadas);
    }
    
    public void MostrarProjeto(){
        
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Objetivo: " + this.objetivo);
        System.out.println("Status: " + this.status);
        System.out.println("Agencia Financiadora: " + this.agenciaFinaciadora + "," + "Valor Financiado: " + this.valorFinanciado);
        System.out.println("Data de Inicio: " + this.diaInicio + " / "+this.mesInicio+" / "+this.anoInicio);
        System.out.println("Data de Termino: " + this.diaTermino + " / "+this.mesTermino+" / "+this.anoTermino);
        System.out.println("Lista de Professores Associados: ");
        for(Professor professor : this.professoresVinculados){
            System.out.println("Nome: " + professor.getNome());
        }
        System.out.println("Lista de Alunos Associados:\n ");
        for(Aluno aluno : this.alunosVinculados){
            System.out.println("Nome: " + aluno.getNome());
        }
        
        System.out.println("Publicações Vinculadas: \n");
        Collections.sort(this.publicacoesVinculadas);
        
        for(Publicacao pub : this.publicacoesVinculadas)
        {
            System.out.println("Titulo: " + pub.getTituloPublicacao());
        }
    }

    @Override
    public int compareTo(Projeto o) {
        
        if(this.anoTermino > o.anoTermino){
            return -1;
        }
        if(this.anoTermino < o.anoTermino){
            return 1;
        }
        return 0;
    }
}
