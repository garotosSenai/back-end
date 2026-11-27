package com.destiny.controller;

import com.destiny.entity.Perfil;
import com.destiny.repository.PerfilRepository;
import com.destiny.service.PerfilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("perfis")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping
    public List<Perfil> buscar (){
        return perfilService.buscarPerfil();
    }

    @PostMapping
    public void cadastrar (@RequestBody Perfil perfil){
        perfilService.cadastrarPerfil(perfil);
    }

    @DeleteMapping ("/{id}")
    public void deletar (@PathVariable Long id){
        perfilService.deletarPerfil(id);
    }

    @PutMapping ("/{id}")
    public void alterar (@PathVariable Long id, @RequestBody Perfil perfil){
        perfilService.alterarPerfil(id, perfil);
    }
}
