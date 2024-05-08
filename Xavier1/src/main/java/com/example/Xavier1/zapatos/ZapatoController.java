package com.example.Xavier1.zapatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/galeria")
public class ZapatoController {
    @Autowired
    private ZapatoService zapatoService;

    @PostMapping("/")
    public Zapato save(@RequestBody Zapato entity){
        return zapatoService.save(entity);
    }

    @GetMapping("/{id}")
    public Zapato findById(@PathVariable long id){
        return zapatoService.findById(id);
    }

    @PutMapping("/")
    public Zapato update(@RequestBody Zapato entity){
        return zapatoService.save(entity);
    }
}