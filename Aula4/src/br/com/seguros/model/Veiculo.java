package br.com.seguros.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private double motor;
    private String cor;

    // criar um construtor com todos os atributos
    public Veiculo (String placa, String modelo, double motor, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
    }

    //construtor padrão
    public Veiculo (){}


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
