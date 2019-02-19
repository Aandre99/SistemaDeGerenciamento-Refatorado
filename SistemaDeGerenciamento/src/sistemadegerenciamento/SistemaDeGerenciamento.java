package sistemadegerenciamento;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemaDeGerenciamento {

    public static Scanner Ler = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        String ola;
        boolean verifica = false;

        ControleDoSistema Sistema = new ControleDoSistema();

        try
        {

            while(true)
            { 
                Sistema.MenuPrincipal();
                opcao = Ler.nextInt();
                
                if(opcao == 0){
                    break;
                }else{

                    switch(opcao)
                    {
                        case 1:

                            Sistema.CadastrarProfessor();
                            break;
                        case 2:
                            Sistema.CadastrarAluno();
                            break;
                        case 3:
                            Sistema.CadastrarProjeto();
                            break;
                        case 4:
                            if(Sistema.getListaDeAlunos().size() > 0 || Sistema.getListaDeProfessores().size() > 0){
                                Sistema.AdicionarPublicacao();
                            }else{
                                System.out.println("Não é possivel alocar autores para a publicação ( Tente Cadastrar Alunos/Professores!)");
                            }
                            break;
                        case 5:
                            if(Sistema.getListaDeProjetos().size() > 0){
                                Sistema.AlocarParticipantes();   
                            }else{
                                System.out.println("Não ha projetos Cadastrados!");
                            }
                            break;
                        case 6:
                             if(Sistema.getListaDePublicacoes().size() > 0){
                                 Sistema.AlocarPublicacao();
                             }else{
                                 System.out.println("Não ha publicações cadastradas!");
                             }
                             break;
                        case 7:
                             if(Sistema.getListaDeProjetos().size() > 0){
                                Sistema.AlterarStatus();
                            }else{
                                System.out.println("Não ha projetos Cadastrados!");
                            }
                             break;
                        case 8:
                            if(Sistema.getColaboradores().size() > 0){
                                Sistema.Consulta();
                            }else{
                                System.out.println("Não ha colaboradores cadastrados!");
                            }
                            break;
                        case 9:
                            Sistema.Relatorio();
                            break;
                    }
                }
            }
        }catch(InputMismatchException e){
                System.out.println("\n-> Entrada informada não é compativel com o tipo de dado esperado!");
                System.out.println("-> Interrompendo o Sistema!");
        }
    }
}
