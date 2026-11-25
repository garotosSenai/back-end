package com.destiny.destiny.controller;

import com.destiny.destiny.entity.usuario.PreferenciaBusca;
import com.destiny.destiny.entity.usuario.Usuario;
import com.destiny.destiny.service.PreferenciaBuscaService;
import com.destiny.destiny.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/preferencia")
public class PreferenciaBuscaController {
    private final PreferenciaBuscaService preferenciaBuscaService;

    public PreferenciaBuscaController(PreferenciaBuscaService preferenciaBuscaService) {
        this.preferenciaBuscaService = preferenciaBuscaService;
    }


    @GetMapping
    public List<PreferenciaBusca> buscarPreferencia(){
        return preferenciaBuscaService.buscarPreferencia();
    }

    @PostMapping
    public void cadastrarPreferencia(@RequestBody PreferenciaBusca p){
        preferenciaBuscaService.cadastrarPreferencia(p);
    }

    @PutMapping("/{id}")
    public void alterarPreferencia(@PathVariable Long id, @RequestBody PreferenciaBusca p){
        preferenciaBuscaService.alterarPreferencia(id, p);
    }


    @DeleteMapping("/{id}")
    public void deletarPrefencia(@PathVariable Long id) {
        preferenciaBuscaService.deletarPrefencia(id);
    }
}
