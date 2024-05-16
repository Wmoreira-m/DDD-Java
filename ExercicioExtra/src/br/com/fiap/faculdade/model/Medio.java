package br.com.fiap.faculdade.model;

public class Medio extends Formacao {

    private String tipo;

    public double calcularMensalidade(double fator){
     return getDuracao() * fator * 500;
    }

    public Medio() {}

    public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
        super(descricao, periodo, mensalidade, duracao);
        this.tipo = tipo;
    }

    @Override
    public void definirDuracao() {
        duracao = 36;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
