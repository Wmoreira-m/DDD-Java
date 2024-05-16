package br.com.fiap.faculdade.model;

public class Bacharelado extends Formacao {

    private String projetoConclusao;

    private int cargaHorariaEstagio;

    public double calcularMensalidade(double fator){
        return (getDuracao() * fator * 600) + (cargaHorariaEstagio * 12);
    }

    public Bacharelado() {}

    public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo, mensalidade, duracao);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    @Override
    public void definirDuracao() {
        if(descricao.toUpperCase().contains("Engenharia")){
            duracao = 60;
        }else {
            duracao = 46;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProjeto Conclusão: " + projetoConclusao +
                "\nCarga Horaria Estagio: " + cargaHorariaEstagio;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
