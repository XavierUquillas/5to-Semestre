package com.example.Xavier1.zapatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZapatoService {
    @Autowired
    private ZapatoRepository zapatoRepository;

    public Zapato save(Zapato entity){
        return zapatoRepository.save(entity);
    }

    public Zapato findById(long id){
        return zapatoRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        zapatoRepository.deleteById(id);
    }
}
