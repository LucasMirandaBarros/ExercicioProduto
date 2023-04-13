package com.primeirotrmpodev.exercicioProduto.controller;

import com.primeirotrmpodev.exercicioProduto.entidade.Carrinho;
import com.primeirotrmpodev.exercicioProduto.entidade.Produto;
import com.primeirotrmpodev.exercicioProduto.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrinho-controller")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    public Carrinho retornarCarrinho(@RequestParam("nomeUsuario")String nomeUsuario,
                                     @RequestParam("telefone")String telefone, @RequestParam("idProdutos") List<Integer> idProdutos){
        return carrinhoService.retornarCarrinho(nomeUsuario, telefone, idProdutos);
    }
}
