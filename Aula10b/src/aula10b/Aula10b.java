/**
 * Nesse programa vamos criar um formulario com caixa de texto e boões de radio
 */
package aula10b;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class Aula10b extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lblNome = new Label("Nome");
        TextField txtFieldNome = new TextField();

        Label lblGenero = new Label("Gênero");
        //Grupo para  gênero
        ToggleGroup grupoGenero = new ToggleGroup();
        RadioButton rbtnMasculino = new RadioButton("Masculino");
        RadioButton rbtnFeminino = new RadioButton("Feminino");

        rbtnMasculino.setToggleGroup(grupoGenero);
        rbtnFeminino.setToggleGroup(grupoGenero);

        rbtnMasculino.setSelected(true);

        HBox hbGenero = new HBox(10, rbtnMasculino, rbtnFeminino);

        Label lblPeriodo = new Label("Periodo");
        //Grupo para o periodo
        ToggleGroup grupoPeriodo = new ToggleGroup();
        RadioButton rbtnManha = new RadioButton("Manhã");
        RadioButton rbtnTarde = new RadioButton("Tarde");
        RadioButton rbtnNoite = new RadioButton("Noite");
        RadioButton rbtnSabado = new RadioButton("Sabado");

        rbtnManha.setToggleGroup(grupoPeriodo);
        rbtnTarde.setToggleGroup(grupoPeriodo);
        rbtnNoite.setToggleGroup(grupoPeriodo);
        rbtnSabado.setToggleGroup(grupoPeriodo);

        rbtnManha.setSelected(true);

        Button btnSalvar = new Button("Salvar");
        Button btnLimpar = new Button("Limpar");
        Button btnFechar = new Button("Fechar");

        HBox hboxBotoes = new HBox(10, btnSalvar, btnLimpar, btnFechar);

        //Layout Principal
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
                lblNome,
                txtFieldNome,
                lblGenero,
                hbGenero,
                lblPeriodo,
                rbtnManha,
                rbtnTarde,
                rbtnNoite,
                rbtnSabado,
                hboxBotoes
        );
        //Logica Botões
        btnSalvar.setOnAction(e -> {

            //captura dos dados
            String nome = txtFieldNome.getText();
            RadioButton trueBotao = (RadioButton) grupoGenero.getSelectedToggle();
            String genero = trueBotao.getText();
            trueBotao = (RadioButton) grupoPeriodo.getSelectedToggle();
            String periodo = trueBotao.getText();

            String dados = "Nome: " + nome + "\n"
                    + "Gênero: " + genero + "\n"
                    + "Periodo: " + periodo;
            

            //Criação dos botões
            ButtonType btnSim = new ButtonType("Sim", ButtonBar.ButtonData.YES);
            ButtonType btnNao = new ButtonType("Não", ButtonBar.ButtonData.NO);

            //Config caixa alerte
            Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
            confirmacao.setTitle("Confirmar Salvamento");
            confirmacao.setHeaderText("Deseja realmente salvar os dados?");
            confirmacao.setContentText(dados);

            //Substituir os botoes padrão
            confirmacao.getButtonTypes().setAll(btnSim, btnNao);

            //Exibição e captura de repostas
            Optional<ButtonType> resultado = confirmacao.showAndWait();
            
            //Logica baseada no botao clicar
            if(resultado.isPresent() && resultado.get()==btnSim){
                System.out.println("---Salvando Dados---\n"+dados);
            }else{
                System.out.println("Operação Cancelada");
            }
        });
        btnLimpar.setOnAction(e -> {
            txtFieldNome.clear();
            rbtnMasculino.setSelected(true);
            rbtnManha.setSelected(true);
        });
        btnFechar.setOnAction(e -> primaryStage.close());

        Scene scene = new Scene(root, 300, 350);

        primaryStage.setTitle("Cadastro de Aluno");
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
