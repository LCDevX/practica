package com.example.practica.service;

import com.example.practica.entities.Sale;
import com.example.practica.repository.SaleRepository;
import com.example.practica.service.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaleService implements Idao <Sale,Long> {



    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> findAll() {
        return List.of();
    }

    @Override
    public Sale getById(Long aLong) {
        return null;
    }

    @Override
    public void save(Sale obje) {
    this.saleRepository.save(obje);
    }

    @Override
    public void delete(Sale obje) {
    this.saleRepository.delete(obje);
    }
}
