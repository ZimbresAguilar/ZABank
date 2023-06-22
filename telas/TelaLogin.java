package telas;

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

public class TelaLogin extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZA Bank - Login");

        // Criação dos elementos da tela inicial
        Button btnPF = new Button("Pessoa Física");
        Button btnPJ = new Button("Pessoa Jurídica");
        Label lblConta = new Label("CPF | CNPJ | Número da Conta:");
        TextField contaField = new TextField();
        Label lblSenha = new Label("Senha");
        TextField senhaField = new TextField();
        Button btnLogin = new Button("Acessar");
        Button btnCancelar = new Button("Cancelar");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        AnchorPane anchorPane = new AnchorPane();
        // Espaçamento do GridPane
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        AnchorPane.setLeftAnchor(gridPane, 225.0);
        AnchorPane.setBottomAnchor(gridPane, 100.0);
        // Adicionando elementos ao GridPane
        gridPane.add(btnPF, 1, 0);
        gridPane.add(btnPJ, 2, 0);
        gridPane.add(lblSenha, 1, 4);
        gridPane.add(senhaField, 0, 5);
        GridPane.setColumnSpan(senhaField, 4);
        gridPane.add(btnLogin, 1, 7);
        gridPane.add(btnCancelar, 2, 7);
        anchorPane.getChildren().add(gridPane);

        // Ação do botão Pessoa Física
        btnPF.setOnAction(event -> {
            gridPane.add(lblConta, 1, 1);
            gridPane.add(contaField, 0, 2);
            GridPane.setColumnSpan(contaField, 4);

            if (gridPane.getChildren().contains(btnPJ)) {
                gridPane.getChildren().remove(btnPF);
            } else {
                gridPane.add(btnPJ, 0, 1);
            }

            gridPane.getChildren().remove(btnPF);
        });
        // Ação do botão Pessoa Jurídica
        btnPJ.setOnAction(event -> {
            gridPane.add(lblConta, 1, 1);
            gridPane.add(contaField, 0, 2);
            GridPane.setColumnSpan(contaField, 4);

            if (gridPane.getChildren().contains(btnPF)) {
                gridPane.getChildren().remove(btnPF);
            } else {
                gridPane.add(btnPF, 0, 1);
            }
        });

        // Ação do botão Sair
        btnCancelar.setOnAction(event -> {
            // Fecha a janela atual
            primaryStage.close();

            // Cria uma instância da tela de criação de conta e exibe
            Main telaInicial = new Main();
            telaInicial.start(new Stage());
        });

        // Configuração da cena e exibição da janela
        Scene scene = new Scene(anchorPane, 700, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }
}
