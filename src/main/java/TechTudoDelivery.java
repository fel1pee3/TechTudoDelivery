package main.java;

import main.java.View.PedidoView;


public class TechTudoDelivery {

    static PedidoView pedidoView = new PedidoView();

    public static void main(String[] args) {

        boolean rodando = true;

        while (rodando) {
            rodando = pedidoView.menuView();
        }

    }
}