package com.primeirotrmpodev.exercicioProduto.service;

import com.primeirotrmpodev.exercicioProduto.entidade.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario getUsuario(String nomeUsuario, String telefone){

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome(nomeUsuario);
        usuario.setTelefone(telefone);

        return usuario;
    }
}
