package main.java.View;

import main.java.Controller.PedidoController;

import java.util.Scanner;

public class PedidoView {

    private PedidoController controller = new PedidoController();
    private Scanner scanner = new Scanner(System.in);

    public boolean menuView() {
        boolean rodando = true;

        System.out.println("\n=== TechTudo Delivery ===");
        System.out.println("1. Cadastrar Pedido");
        System.out.println("2. Listar Pedidos Pendentes");
        System.out.println("3. Marcar Pedido como Entregue");
        // Add um novo print pra mostrar uma nova seleção (nº 4)
        System.out.println("4. Remover Pedidos Entregues11");
        System.out.println("5. Sair");

        String opcao = scanner.nextLine();

        switch (opcao) {
            case "1" -> controller.cadastrarPedido();
            case "2" -> controller.listarPedido();
            case "3" -> controller.entregarPedido();
            // Pela lógica tbm add aqui no Switch
            case "4" -> controller.removerEntregues();
            case "5" -> {
                rodando = false;
                System.out.println("Saindo...");
            }
            default -> System.out.println("Opção inválida.");
        }
        return rodando;
    }

}
