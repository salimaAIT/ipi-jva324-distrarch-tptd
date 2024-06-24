package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


@Component
public class CommandeProduitServiceRESTHALImpl implements CommandeProduitService  {


        @Value("${stockapiserver.url:http://localhost:8080/}")
        private String url;


        @Autowired @Qualifier("springDataRestTemplate")
        private RestTemplate restTemplate;


        @Override
        public ProduitEnStock getProduit(long id){
            return restTemplate.getForObject(url + "produitEnStocks/" + id, ProduitEnStock.class); // TODO RESTHAL
        }


}
