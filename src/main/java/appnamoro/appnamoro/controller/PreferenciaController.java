package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Preferencia;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/preferencia")
public class PreferenciaController {

    private List<Preferencia> listaPreferencia = new ArrayList<>();

    private Long proximoId = 1L;


    //metodo POST (salvar)
    @PostMapping
    public ResponseEntity <Preferencia> salvarPreferencia (@RequestBody Preferencia novaPreferencia){
        novaPreferencia.setIdPreferencia(proximoId++);
        listaPreferencia.add(novaPreferencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPreferencia);
    }

    @GetMapping
    public List<Preferencia> mostrarPreferencia (){
        return listaPreferencia;
    }

    @GetMapping ("/usuario/{idUsuario}")
    public Preferencia buscarPorIdUsuario (@PathVariable Long idUsuario){
        for (Preferencia preferencia : listaPreferencia){
            if (preferencia.getIdUsuario().equals(idUsuario)){
                return preferencia;
            }
        }
        return null;
    }

    @DeleteMapping
}
