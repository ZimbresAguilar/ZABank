package contas;

public class PessoaJuridica extends Conta{
    //-----===ATRIBUTOS===-----//
    private String razaoSocial;
    private String nomeFantasia;
    private String idade;
    private String cnpj;
    private String cnae;
    private double capitalSocial;
    private double faturamentoAnual;

    //-----===CONSTRUTOR===-----//
    public PessoaJuridica(String numeroConta, String senha, double saldo, String razaoSocial, String nomeFantasia, String idade, String cnpj, String cnae, double capitalSocial, double faturamentoAnual){
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.idade = idade;
        this.cnpj = cnpj;
        this.cnae = cnae;
        this.capitalSocial = capitalSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    //-----===GETTERS & SETTERS===-----//
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnae() {
        return cnae;
    }
    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }
    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }
    public void setFaturamentoAnual(double faturamentoAnual) {
        this.faturamentoAnual = faturamentoAnual;
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