package com.rrramos.gestaosenhasspring.servico;

import com.rrramos.gestaosenhasspring.dominio.Senha;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenhaService {

    public String novaSenha() {
        return "N1245";
    }

    public String novaSenhaPreferencial() {
        return "P4578";
    }

    public List<Senha> findAllSenhas() {
        Long count;
        return null;
    }
}
