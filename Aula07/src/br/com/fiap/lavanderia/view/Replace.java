package br.com.fiap.lavanderia.view;

import javax.swing.*;

public class Replace {
    public static void main(String[] args) {
        String ler = JOptionPane.showInputDialog("Digite sua palavra")
                .replace("a", "*")
                .replace("e", "*")
                .replace("i", "*")
                .replace("o", "*")
                .replace("u", "*");

        JOptionPane.showMessageDialog(null, ler);
    }
}
