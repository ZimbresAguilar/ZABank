package telas;
import controle.Gerenciamento;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TelaConta extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZA Bank - Conta");

        Gerenciamento gerenciar = new Gerenciamento();

        // Criação dos elementos da tela inicial
        Label lblInfo = new Label("INFO");
        gerenciar.VerificacaoLogin("PF", "00000000000");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        AnchorPane anchorPane = new AnchorPane();
        // Espaçamento do GridPane
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        AnchorPane.setLeftAnchor(gridPane, 225.0);
        AnchorPane.setBottomAnchor(gridPane, 70.0);
        // Adicionando elementos ao GridPane
        // PF ou PJ
        gridPane.add(lblInfo, 1, 0);
        // Colocando gridPane no anchorPane
        anchorPane.getChildren().add(gridPane);

        // Configuração da cena e exibição da janela
        Scene scene = new Scene(anchorPane, 700, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }
    
}
