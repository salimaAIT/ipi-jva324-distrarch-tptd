package com.ipi.java324.stock;

import com.ipi.java324.Jva324StockApplication;
import com.ipi.java324.stock.model.ProduitEnStock;
import com.ipi.java324.stock.repository.ProduitEnStockRepository;
import com.ipi.java324.stock.service.ProduitService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) // Junit 4 : @RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(Jva324StockApplication.class)
public class StockTest {

    /** TODO rm, pas utile ici */
    @Value(value="${local.server.port}")
    private int port;

   // @Autowired
   // private CommandeService commandeService;

    @Autowired
    private ProduitEnStockRepository produitEnStockRepository;

    /** aide pour les tests */
    @Autowired
    private ProduitService produitService;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testGetProduits() {
        // produit créé en init
        ProduitEnStock p1 = produitService.getProduits().get(0);

        Assertions.assertEquals("iPhone 13 Pro", p1.getNom());
    }






}
