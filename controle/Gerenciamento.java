package controle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import contas.Conta;
import contas.PessoaFisica;

public class Gerenciamento {
    DBManager dbmanager = new DBManager();

    public void VerificacaoLogin(String tipo, String numeroConta){
        if (tipo.equalsIgnoreCase("PF")) {
            numeroConta = Formatar("PF", numeroConta);
        }
        else{
            numeroConta = Formatar("PJ", numeroConta);
        }
        
        System.out.println(numeroConta);

        PessoaFisica pessoaFisica = new PessoaFisica();
        System.out.println(pessoaFisica.getCpf());
        
        List<Conta> resultados = dbmanager.Read(tipo, numeroConta);

        System.out.println(pessoaFisica.getCpf());

        for (Conta pessoa : resultados) {
            System.out.println(pessoa.getNumeroConta() + pessoa.getSaldo());
        }
    }

    public String Formatar(String tipo, String numeroConta){
        numeroConta = numeroConta.replaceAll("\\D", "");

        if(tipo.equalsIgnoreCase("PF")){
            numeroConta = numeroConta.substring(0, 3) + "." + numeroConta.substring(3, 6) + "." + numeroConta.substring(6, 9) + "-" + numeroConta.substring(9);
            return numeroConta;
        }
        else{
            numeroConta = "b";
            return numeroConta;
        }
    }
}