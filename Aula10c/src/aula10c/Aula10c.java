/**
 *
 */
package aula10c;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class Aula10c extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane painel = new BorderPane();
        
        //Barra de Menu
        MenuBar barraMenu = new MenuBar();
        
        //Menu Alunos, Cursos e Professores 
        Menu menuAlunos = new Menu("Alunos");
        Menu menuCursos = new Menu("Cursos");
        Menu menuProfessores = new Menu("Professores");
        
        //Item do Menu Alunos
        MenuItem itemCadastrarAluno = new MenuItem("Cadastrar");
        MenuItem itemAlterarAluno = new MenuItem("Alterar");
        MenuItem itemExcluirAluno = new MenuItem("Excluir");
        MenuItem itemConsultarAluno = new MenuItem("Consultar");
        
        //Item do menu Cursos
        MenuItem itemCadastrarCurso = new MenuItem("Cadastrar");
        MenuItem itemAlterarCurso = new MenuItem("Alterar");
        MenuItem itemExcluirCurso = new MenuItem("Excluir");
        MenuItem itemConsultarCurso = new MenuItem("Consultar");
        
        //Item do menu Professor
        MenuItem itemCadastrarProfessor = new MenuItem("Cadastrar");
        MenuItem itemAlterarProfessor = new MenuItem("Alterar");
        MenuItem itemExcluirProfessor = new MenuItem("Excluir");
        MenuItem itemConsultarProfessor = new MenuItem("Consultar");
        
        //Adicionando Sub menu Alunos
        menuAlunos.getItems().add(itemCadastrarAluno);
        menuAlunos.getItems().add(itemAlterarAluno);
        menuAlunos.getItems().add(itemExcluirAluno);
        menuAlunos.getItems().add(itemConsultarAluno);
        
        //Adicionando Sub Menos dos cursos
        menuCursos.getItems().add(itemCadastrarCurso);
        menuCursos.getItems().add(itemAlterarCurso);
        menuCursos.getItems().add(itemExcluirCurso);
        menuCursos.getItems().add(itemConsultarCurso);
        
        //Adicionando Sub Menos dos Professores
        menuProfessores.getItems().add(itemCadastrarProfessor);
        menuProfessores.getItems().add(itemAlterarProfessor);
        menuProfessores.getItems().add(itemExcluirProfessor);
        menuProfessores.getItems().add(itemConsultarProfessor);
        
        barraMenu.getMenus().add(menuAlunos);
        barraMenu.getMenus().add(menuCursos);
        barraMenu.getMenus().add(menuProfessores);
        
        painel.setTop(barraMenu);
        
        //Evento do Menu
        itemCadastrarAluno.setOnAction(e -> {
            CadastroAluno cadastroAluno = new CadastroAluno();
            cadastroAluno.mostrar(primaryStage);
        });
        
        Scene scene = new Scene(painel, 600, 400);
        
        primaryStage.setTitle("Sistema de Escola");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
