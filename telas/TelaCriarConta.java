package telas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCriarConta extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZA Bank - SignUp");

        // Criação dos elementos da tela inicial
        Button btnCancelar = new Button("Cancelar");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        // Espaçamento do GridPane
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        // Adicionando elementos ao GridPane
        gridPane.add(btnCancelar, 0, 10);

        // Ação do botão Sair
        btnCancelar.setOnAction(event -> {
            // Fecha a janela atual
            primaryStage.close();

            // Cria uma instância da tela de criação de conta e exibe
            Main telaInicial = new Main();
            telaInicial.start(new Stage());
        });

        // Configuração da cena e exibição da janela
        Scene scene = new Scene(gridPane, 700, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }  
}
