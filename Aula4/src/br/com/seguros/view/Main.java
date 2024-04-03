package br.com.seguros.view;

import br.com.seguros.model.Cliente;
import br.com.seguros.model.Funcionario;
import br.com.seguros.model.Profissao;
import br.com.seguros.model.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("weslley", "584648641");

        Veiculo veiculo = new Veiculo("s9d6c4", "bmw", 2.0, "Pretão");

        Cliente gabriela = new Cliente("weslley","5498456494", veiculo);

        Profissao profissao = new Profissao("UX");
        Funcionario funcionario =  new Funcionario("José",46846, profissao, 20.000);




        System.out.println(gabriela.getNome()  + " " + gabriela.getCpf());
        System.out.println(
                "Modelo: " + gabriela.getVeiculo().getModelo()  + " " +
                 "Cor: " + gabriela.getVeiculo().getCor()  + " " +
                  "Placa: " + gabriela.getVeiculo().getPlaca() + " " +
                   "Motor: " + gabriela.getVeiculo().getMotor());


        System.out.println("Funcionario " + funcionario.getNome() + " matricula " + funcionario.getMatricula()
                            + " profissão " + profissao.getNome() + " salário " + funcionario.getSalario());


        System.out.println(funcionario.exibirDados());


    }
}