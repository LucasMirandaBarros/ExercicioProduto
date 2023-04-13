package com.primeirotrmpodev.exercicioProduto.service;

import com.primeirotrmpodev.exercicioProduto.entidade.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ServiceProduto serviceProduto;

    public Carrinho retornarCarrinho(String nomeUsuario,  String telefone, List<Integer> idProdutos){

        Carrinho carrinho = new Carrinho();
        carrinho.setUsuario(usuarioService.getUsuario(nomeUsuario, telefone));
        carrinho.setProdutoList(serviceProduto.retornaListaDeProduto(idProdutos));

        return carrinho;
    }
}
