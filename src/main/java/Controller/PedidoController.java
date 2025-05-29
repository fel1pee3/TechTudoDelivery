package main.java.Controller;

import main.java.Model.PedidoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoController {

    static Scanner scanner = new Scanner(System.in);
    static List<PedidoModel> pedidos = new ArrayList<>();

     public  void cadastrarPedido(){
         System.out.print("Digite o nome do pedido: ");
         String pedido = scanner.nextLine();
         pedidos.add(new PedidoModel(pedido));
         System.out.println("Pedido cadastrado com sucesso!");

     }

     public void listarPedido() {
         System.out.println("Todos os pendentes:");
         // boolean encontrou = false;
         for (int i = 0; i < pedidos.size(); i++) {
             // O if a baixo foi removido, porque antes de listar os itens os entrehues já,
             // eram removidos, mas deixava a lista bagunçada, pulava o num do item removido.
             // if (!pedidos.get(i).isEntregue()) {
                 System.out.println((i + 1) + ". " + pedidos.get(i));
                 // 1encontrou = true;
             // }
         }
     }

     public void entregarPedido () {
                 System.out.print("Digite o número do pedido a marcar como entregue: ");
                 try {
                     int numero = Integer.parseInt(scanner.nextLine());
                     if (numero > 0 && numero <= pedidos.size()) {
                         pedidos.get(numero - 1).marcarComoEntregue();
                         System.out.println("Pedido marcado como entregue!");
                     } else {
                         System.out.println("Pedido inválido.");
                     }
                 } catch (Exception e) {
                     System.out.println("Entrada inválida.");
                 }
     }

     // O método Remover os entregues fiz dessa forma, Resumindo os pedidos é atualizado,
     // onde os que foram marcado como entregues (True), são removidos da lista.
     public void removerEntregues () {
         System.out.println("Pedidos entregues removidos: ");
         pedidos.removeIf(PedidoModel::isEntregue);
     }
}
