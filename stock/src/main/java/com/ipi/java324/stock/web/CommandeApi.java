package com.ipi.java324.stock.web;

import com.ipi.java324.stock.service.StockInsuffisantCommandeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commandes")
public class CommandeApi {

    @Autowired
    private CommandeService commandeService;

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeService.createCommande(commande);
    }

    @PutMapping("{id}")
    public Commande updateCommande(@RequestBody Commande commande) { // without @RequestBody, commande is not filled by auto databinding (though it would be in a web @Controller)
        return commandeService.updateCommande(commande);
    }

    @PostMapping("{id}/validate")
    public Commande validateCommande(@RequestBody Commande commande) // without @RequestBody, commande is not filled by auto databinding (though it would be in a web @Controller)
            throws StockInsuffisantCommandeException, CommandeInvalideException {
        return commandeService.validateCommande(commande);
    }

    /** que pour tester à ce stade */
    @GetMapping
    public List<Commande> getCommandes() {
        return commandeService.getCommandes();
    }

}
