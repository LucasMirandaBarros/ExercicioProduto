package com.primeirotrmpodev.exercicioProduto.service;

import com.primeirotrmpodev.exercicioProduto.entidade.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceProduto {

    public boolean retornaListaDeProduto(List<Integer> idProdutos){

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Tenis");
        produto1.setPreco(320.99);

        Produto produto2 = new Produto();
        produto2.setId(2);
        produto2.setNome("Bicleta");
        produto2.setPreco(1950.99);

        Produto produto3 = new Produto();
        produto3.setId(3);
        produto3.setNome("Luvas");
        produto3.setPreco(50.59);

        Produto produto4 = new Produto();
        produto4.setId(4);
        produto4.setNome("Celular");
        produto4.setPreco(3980.65);

        Produto produto5 = new Produto();
        produto5.setId(5);
        produto5.setNome("Panela");
        produto5.setPreco(70.00);

        Produto produto6 = new Produto();
        produto6.setId(6);
        produto6.setNome("Skate");
        produto6.setPreco(300.00);

        Produto produto7 = new Produto();
        produto7.setId(7);
        produto7.setNome("Fone de ouvido");
        produto7.setPreco(20.00);

        List<Produto> produtos = new ArrayList<>();

        for(Integer cont = 0; cont < idProdutos.size(); cont++){
            Integer idProduto = idProdutos.get(cont);

            if(idProduto.equals(1)){
                produtos.add(produto1);
            } else if (idProduto.equals(2)) {
                produtos.add(produto2);
            }
        }

       return produtos;





    }
}
