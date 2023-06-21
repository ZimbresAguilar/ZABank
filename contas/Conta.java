package contas;

public abstract class Conta{
    //-----===ATRIBUTOS===-----//
    protected String numeroConta;
    protected String senha;
    protected double saldo;

    //-----===CONSTRUTOR===-----//
    public Conta(){}

    //-----===GETTERS & SETTERS===-----//
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}

/*
Conta:
    Pessoa Física:
        .Nome
        .Idade
        .CPF
        .Número da Conta
        .Salário
        .Saldo
        .Senha
    Pessoa Jurídica:
        .Razão Social
        .Nome Fantasia
        .Idade
        .CNPJ
        .Número da Conta
        .CNAE
        .Capital Social
        .Saldo
        .Faturamento Anual
        .Senha
*/