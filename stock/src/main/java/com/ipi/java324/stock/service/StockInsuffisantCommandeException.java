package com.ipi.java324.stock.service;

public class StockInsuffisantCommandeException extends Exception {

    public StockInsuffisantCommandeException() {
        super("Quantité en stock insuffisante, commande non validée !");
    }

}
