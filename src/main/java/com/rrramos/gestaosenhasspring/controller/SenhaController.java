package com.rrramos.gestaosenhasspring.controller;

import com.rrramos.gestaosenhasspring.dominio.Senha;
import com.rrramos.gestaosenhasspring.servico.SenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SenhaController {

    @Autowired
    private SenhaService senhaService;

    @PostMapping("/nova/Senha/Normal")
    public String novaSenha(){
        return senhaService.novaSenha();
    }

    @PostMapping("/nova/Senha/Preferencial")
    public String novaSenhaPreferencial(){
        return senhaService.novaSenhaPreferencial();
    }

    @GetMapping("senha/proxima")
    public List<Senha> findAllSenhas (){
        return senhaService.findAllSenhas();
    }


}
