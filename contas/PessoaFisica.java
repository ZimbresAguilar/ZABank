package contas;

public class PessoaFisica extends Conta{
    //-----===ATRIBUTOS===-----//
    private String nome;
    private String idade;
    private String cpf;
    private double salario;

    //-----===CONSTRUTOR===-----//
    public PessoaFisica(String numeroConta, String senha, double saldo, String nome, String idade, String cpf, double salario){
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    //-----===GETTERS & SETTERS===-----//
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
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