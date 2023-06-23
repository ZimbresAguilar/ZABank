package controle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import contas.Conta;
import contas.PessoaFisica;

public class DBManager {
    //Dados para conexão com Banco de Dados
    private String url = "jdbc:mysql://localhost:3307/zabank";
    private String usuario = "root";
    private String senha = "MySql_2005_password";
    private Connection connection;

    // Estabelecendo conexão com Banco de Dados com o construtor
    public DBManager(){
        // Tem que colocar um try-catch pois, se não lidar com possíveis erro como sqlExeption e então fica indicando erro
        try{
            // É através do statement que pode enviar comandos ao mysql "PreparedStatement statement = connection.PreparedStatement();""
            connection = DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    //CRUD
    //Create
    public void Create(){}

    //Read
    public List<Conta> Read(String tipo, String numeroConta){
        List<Conta> informacoes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM pessoaFisica WHERE numeroConta = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, numeroConta);
            
            if (tipo.equalsIgnoreCase("PF")) {
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    PessoaFisica pessoaFisica = new PessoaFisica(resultSet.getString("numeroConta"), resultSet.getString("senha"), resultSet.getDouble("saldo"), resultSet.getString("nome"), resultSet.getDate("dataNascimento"), resultSet.getString("cpf"), resultSet.getDouble("salario"));

                    informacoes.add(pessoaFisica);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return informacoes;
    }

    //Update
    public void Update(){}

    //Delete
    public void Delete(){}

    //Encerrando conexão com o Banco de Dados
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
}
