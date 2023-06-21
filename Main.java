import javafx.application.Application;
import javafx.geometry.Insets;
//  import javafx.geometry.Pos;
//  import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//  import javafx.scene.image.Image;
//  import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
//  import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import telas.TelaCriarConta;
import telas.TelaLogin;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {                 //Os comentários seguidos de TAB é os códigos para inserir a imagem... está "funcionando" mas não da pra ver os botões com ele funcionando, então teria que arrumar
        primaryStage.setTitle("ZA Bank");

        // Criação dos elementos da tela inicial
        Button btnAcessarConta = new Button("Acessar Conta");
        Button btnCriarConta = new Button("Criar Conta");
        Button btnSair = new Button("Sair");

        //  // Carrega a imagem do arquivo
        //  Image image = new Image("img/zaLogo.jpg");
        //  // Cria um ImageView e define a imagem nele
        //  ImageView imageView = new ImageView(image);
        //  imageView.setFitWidth(700); // Largura da janela
        //  imageView.setFitHeight(250); // Altura da janela

        // Criação do GridPane, AnchorPane e StackPane
        GridPane gridPane = new GridPane();
        AnchorPane anchorPane = new AnchorPane();
        //  StackPane stackPane = new StackPane();

        // Espaçamento do GridPane, AnchorPane e StackPane
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        AnchorPane.setLeftAnchor(gridPane, 225.0);
        AnchorPane.setBottomAnchor(gridPane, 30.0);
        //  StackPane.setAlignment(imageView, Pos.TOP_CENTER);

        // Adicionando elementos ao GridPane, AnchorPane e StackPane
        gridPane.add(btnAcessarConta, 0, 10);
        gridPane.add(btnCriarConta, 1, 10);
        gridPane.add(btnSair, 2, 10);
        anchorPane.getChildren().add(gridPane);
        //  stackPane.getChildren().add(imageView);

        // Ação do botão Acessar Conta
        btnAcessarConta.setOnAction(event -> {
            // Fecha janela atual
            primaryStage.close();

            // Cria uma instância da tela pra acessar a conta e a exibe
            TelaLogin telaAcessarConta = new TelaLogin();
            telaAcessarConta.start(new Stage());
        });

        // Ação do botão Criar Conta
        btnCriarConta.setOnAction(event -> {
            // Fecha a janela atual
            primaryStage.close();

            // Cria uma instância da tela de criação de conta e exibe
            TelaCriarConta telaCriarConta = new TelaCriarConta();
            telaCriarConta.start(new Stage());
        });

        // Ação do botão Sair
        btnSair.setOnAction(event -> primaryStage.close());

        // Configuração da cena e exibição da janela
        Scene scene = new Scene(anchorPane, 700, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }
}