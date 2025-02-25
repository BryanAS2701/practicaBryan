package com.poryect1.practicaBryan.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poryect1.practicaBryan.Modelo.Pedido;
import com.poryect1.practicaBryan.Repository.Pedido_Repository;
@Service
public class Pedido_Services {
    @Autowired
    Pedido_Repository pedido_Repository;

    public List<Pedido> getPedidos(){
        return pedido_Repository.findAll();
    }

    public Optional<Pedido> getPedidos(Long id){
        return pedido_Repository.findById(id);
    }

    public void saveOrUpdate(Pedido pedido){
        pedido_Repository.save(pedido);
    }

    public void borrar(Long id){
        pedido_Repository.deleteById(id);
    }
}
