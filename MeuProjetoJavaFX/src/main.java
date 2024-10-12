package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {

    // URL de conexão: jdbc:sqlserver://[HOST]:[PORT];databaseName=[NOME_DO_BANCO];
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=CriminalAPP";
    private static final String USER = "Anny-APSOO";
    private static final String PASSWORD = "ufms2024";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Estabelecendo a conexão com o banco de dados
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao conectar com o banco de dados.");
        } finally {
            // Fechando a conexão
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexão fechada.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("System Criminal V2 JavaFX");
        primaryStage.setScene(project.jpeg)
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
public void DocumentoDestino(int id_documento, String nome_responsavel, String cena_crime){
    this.id_documento = id_documento;
    this.nome_responsavel = nome_responsavel;
    this.cena_crime = cena_crime;
}
}
