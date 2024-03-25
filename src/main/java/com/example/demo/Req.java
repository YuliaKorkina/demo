package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping
public class Req {
    @PostMapping(path = "/mock", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> mock(@RequestBody Client client) {
        Random random = new Random();
        switch (client.getClientId().substring(0,1)) {
            case "8":
                client.setCurrency("US");
                client.setMaxLimit(2000);
                client.setBalance(random.nextInt(client.getMaxLimit()+1));
                break;
            case "9":
                client.setCurrency("EU");
                client.setMaxLimit(1000);
                client.setBalance(random.nextInt(client.getMaxLimit()+1));
                break;
            default:
                client.setCurrency("RU");
                client.setMaxLimit(10000);
                client.setBalance(random.nextInt(client.getMaxLimit()+1));
                break;
        }
        return ResponseEntity.ok(client.getResp());
    }
}
