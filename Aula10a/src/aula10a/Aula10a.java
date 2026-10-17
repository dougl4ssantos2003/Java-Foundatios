/**
 * Nesse programa vamos criar um formulario de login do Usuário
 */
package aula10a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class Aula10a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lblUsu = new Label("Nome do Usuário");
        TextField txtFieldUsu = new TextField();
        
        Label lblSenha = new Label("Digite a Senha");
        PasswordField pwFieldSenha = new PasswordField();
        
        Button btnLogin = new Button("LOGIN");
        Button btnLimpar = new Button("LIMPAR");
        
        // Evento do botão login
        btnLogin.setOnAction(e ->{
           System.out.println("Usuario: "+txtFieldUsu.getText());
           System.out.println("Senha: "+pwFieldSenha.getText());
        });
        // Evento do botão limpar
        btnLimpar.setOnAction(e ->{
            txtFieldUsu.clear();
            pwFieldSenha.clear();
        });
        
        // Painel principal usando Grid Layout
        GridPane painel = new GridPane();
        painel.setPadding(new Insets(20));
        painel.setHgap(10);
        painel.setVgap(10);
        
        painel.add(lblUsu, 0, 0);
        painel.add(txtFieldUsu, 1, 0);
        painel.add(lblSenha, 0, 1);
        painel.add(pwFieldSenha, 1, 1);
        
        //painel de botões
        HBox botoes = new HBox(10);
        botoes.setAlignment(Pos.CENTER_RIGHT);
        botoes.getChildren().addAll(btnLogin,btnLimpar);
        
        painel.add(botoes, 1, 2);
        
        
        //StackPane root = new StackPane();
        
        
        Scene scene = new Scene(painel, 350, 120);
        
        primaryStage.setTitle("LOGIN DO USUÁRIO");
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
