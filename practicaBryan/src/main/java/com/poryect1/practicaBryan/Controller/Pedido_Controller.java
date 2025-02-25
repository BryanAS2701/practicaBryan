package com.poryect1.practicaBryan.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.poryect1.practicaBryan.Modelo.Pedido;
import com.poryect1.practicaBryan.Services.Pedido_Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class Pedido_Controller {
    @Autowired
    private Pedido_Services pedido_Services;

    @GetMapping("consultar/{id}")
    public Optional<Pedido> getByPedido(@PathVariable("id") Long id){
        return pedido_Services.getPedidos(id);
    }
    @PostMapping
    public void guardarActualizar(@RequestBody Pedido pedido){
        pedido_Services.saveOrUpdate(pedido);
    }
    @DeleteMapping("delete/{id}")
    public void borrarPedido(@PathVariable("id") Long id){
        pedido_Services.borrar(id);
    }
}
