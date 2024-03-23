package br.com.seguros.model;

public class Cliente {

    private String nome;
    private Veiculo veiculo;
    private String cpf;

    //método construtor
    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public Cliente(String nome, String cpf, Veiculo veiculo){
        this.nome = nome;
        this.cpf = cpf;
        this.veiculo = veiculo;
    }

     //Get e Set = encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
