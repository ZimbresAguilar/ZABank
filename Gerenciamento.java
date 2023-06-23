import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import contas.Conta;

public class Gerenciamento {
    //Dados para conexão com Banco de Dados
    String url = "jdbc:mysql://localhost:3307/zabank";
    String usuario = "root";
    String senha = "MySql_2005_password";
    //Estabelecendo conexão com Banco de Dados
    //Tem que colocar um try-catch pois, se não lidar com possíveis erro como sqlExeption fica indicando erro
    try (Connection connection = DriverManager.getConnection(url, usuario, senha)){
        //É através do statement que pode enviar comandos ao mysql
        //PreparedStatement statement = connection.PreparedStatement();
    }
    catch (Exception e) {
        e.printStackTrace();
    }



    private List<Conta> contas;

    public Gerenciamento(){
        contas = new ArrayList<>();
    }
}

/*
CPF: xxx.xxx.xxx-xx
CNPJ: xx.xxx.xxx/0001-xx
CNAE: xxxx-x/xx
*/