package main.java.Model;

public class PedidoModel {

    private String descricao;
    private boolean entregue;

    public PedidoModel (String descricao) {
        this.descricao = descricao;
        this.entregue = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void marcarComoEntregue () {
        this.entregue = true;
    }

    public String toString() {
        return descricao + (entregue ? " (Entregue)" : " (Pendente)");
    }

}
