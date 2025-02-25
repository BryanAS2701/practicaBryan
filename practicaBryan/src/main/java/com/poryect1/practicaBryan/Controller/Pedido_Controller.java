package com.poryect1.practicaBryan.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.poryect1.practicaBryan.Modelo.Pedido;
import com.poryect1.practicaBryan.Security.dto.RequestException;
import com.poryect1.practicaBryan.Services.Pedido_Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity guardarActualizar(@RequestBody Pedido pedido){
        if(pedido.getName().equals("")||pedido.getName()== null){
            throw new RequestException("P-401", "Pedido name is required");
        }
        if(pedido.getTipo().equals("")||pedido.getTipo()== null){
            throw new RequestException("P-402", "Pedido type is required");
        }
        return new ResponseEntity(HttpStatus.CREATED);

    }
    @DeleteMapping("delete/{id}")
    public void borrarPedido(@PathVariable("id") Long id){
        pedido_Services.borrar(id);
    }
}
