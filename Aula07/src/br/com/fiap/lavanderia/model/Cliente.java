package br.com.fiap.lavanderia.model;

public class Cliente extends Pessoa{

    private boolean assinante;

    public void pagar(double valor) {

        if(assinante){
            valor = valor * 0.9;
        }
        System.out.println(nome + " o valor a ser pago é " + valor);
    }

    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
