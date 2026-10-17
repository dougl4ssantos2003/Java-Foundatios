/**
 * 
 */
package aula10c;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class CadastroAluno {
    
    
    private TextField txtNome;
    private TextField txtCurso;
    private ChoiceBox<String> cbPeriodo;
    private DatePicker dpNascimento;
    private RadioButton rbMasculino;
    private RadioButton rbFeminino;
    private CheckBox chkRG;
    private CheckBox chkCPF;
    private CheckBox chkComprovante;
    private CheckBox chkHistorico;
    
   
    public void mostrar(Stage dono) {
        
        Stage primaryStage = new Stage();
        //Configurando Layout
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #4CAF50;");
        
        //criação do Layout em grade
        GridPane grade = new GridPane();
        grade.setVgap(10);
        grade.setHgap(10);
        
        //Campos de entrada de dados
        txtNome = new TextField();
        txtNome.setPrefWidth(250);//define a largura do campo
        grade.add(new Label("Nome:"), 0, 0);
        grade.add(txtNome, 1, 0);
        
        txtCurso = new TextField();
        txtCurso.setPrefWidth(250);
        grade.add(new Label("Curso:"),0,1);
        grade.add(txtCurso,1,1);
        
        //Periodo com Choice Box
        cbPeriodo = new ChoiceBox();
        cbPeriodo.getItems().addAll("Manhã","Tarde","Noite","Sabado");
        grade.add(new Label("Periodo:"), 0, 2);
        grade.add(cbPeriodo,1,2);
        
        //Data de Nascimento com  date picker
        dpNascimento = new DatePicker();
        grade.add(new Label("Data de Nascimento:"), 0, 3);
        grade.add(dpNascimento, 1, 3);
        
        //Genero com RadioButton
        ToggleGroup grupoSexo = new ToggleGroup();
        rbMasculino = new RadioButton("Masculino");
        rbMasculino.setToggleGroup(grupoSexo);
        rbFeminino = new RadioButton("Feminino");
        rbFeminino.setToggleGroup(grupoSexo);
        rbMasculino.setSelected(true);
        
        HBox hbSexo = new HBox(10, rbMasculino, rbFeminino);
        grade.add(new Label("Sexo:"),0,4);
        grade.add(hbSexo, 1, 4);
        
        //Documentos Entregues com CheckBox
        chkRG = new CheckBox("RG:");
        chkCPF = new CheckBox("CPF:");
        chkComprovante = new CheckBox("Comprovantes:");
        chkHistorico = new CheckBox("Histórico:");
        VBox vbDoc = new VBox(5,chkRG, chkCPF, chkComprovante, chkHistorico);
        grade.add(new Label("Documentos Entregues"), 0, 5);
        grade.add(vbDoc, 1, 5);
        
        //Botões 
        Button btnSalvar = new Button("Salvar");
        Button btnLimpar = new Button("Limpar");
        Button btnFechar = new Button("Fechar");
        
        HBox hbBotoes = new HBox(10,btnSalvar, btnLimpar, btnFechar);
        
        root.getChildren().addAll(grade, hbBotoes);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Cadastro Aluno");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
}
