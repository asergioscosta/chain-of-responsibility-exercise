package org.sistemaentregas;

public class Produto {

    private StatusProduto statusProduto;

    public Produto(StatusProduto statusProduto) {
        this.statusProduto = statusProduto;
    }

    public StatusProduto getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(StatusProduto statusProduto) {
        this.statusProduto = statusProduto;
    }
}
