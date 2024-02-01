package com.example.esercizio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/v2/ciao/Lombardia")
    public Saluto saluta(@RequestParam String nome) {
        String provincia = "Lombardia";
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new Saluto(nome, provincia, saluto);
    }
}
