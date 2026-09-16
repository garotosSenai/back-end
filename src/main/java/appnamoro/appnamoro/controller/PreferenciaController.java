package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Preferencia;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/preferencia")
public class PreferenciaController {

    private List<Preferencia> listaPreferencia = new ArrayList<>();

    private Long proximoId = 1L;


    //metodo POST (salvar)
    @PostMapping
    public Preferencia salvarPreferencia (@RequestBody Preferencia novaPreferencia){
        novaPreferencia.setIdUsuario(proximoId++);
        listaPreferencia.add(novaPreferencia);
        return novaPreferencia;
    }

}
