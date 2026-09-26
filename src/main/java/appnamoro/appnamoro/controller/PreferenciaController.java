package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Preferencia;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Preferencia>> mostrarPreferencia (){
        return ResponseEntity.ok(listaPreferencia);
    }

    @GetMapping ("/usuario/{idUsuario}")
    public ResponseEntity<Preferencia> buscarPorId (@PathVariable Long idUsuario){
        for (Preferencia preferencia : listaPreferencia){
            if (preferencia.getIdUsuario().equals(idUsuario)){
                return ResponseEntity.ok(preferencia);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPreferencia (@PathVariable Long id) {
        for (Preferencia preferencia : listaPreferencia){
            if (preferencia.getIdPreferencia().equals(id)) {
                listaPreferencia.remove(preferencia);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Preferencia> atualizarPreferencia (@PathVariable Long id, @RequestBody Preferencia preferenciaAtualizada){
        for (Preferencia preferencia : listaPreferencia){
            if (preferencia.getIdPreferencia().equals(id)){
                preferencia.setGenero(preferenciaAtualizada.getGenero());
                preferencia.setIdadeMaxima(preferenciaAtualizada.getIdadeMaxima());
                preferencia.setIdadeMinima(preferenciaAtualizada.getIdadeMinima());
                preferencia.setDistanciaMaxima(preferenciaAtualizada.getDistanciaMaxima());
                preferencia.setAlturaMaxima(preferenciaAtualizada.getAlturaMaxima());
                preferencia.setAlturaMinima(preferenciaAtualizada.getAlturaMinima());
                preferencia.setSigno(preferenciaAtualizada.getSigno());
                preferencia.setEscolaridade(preferenciaAtualizada.getEscolaridade());
                preferencia.setEstadoProfissional(preferenciaAtualizada.getEstadoProfissional());

                return ResponseEntity.ok(preferencia);
            }
        }
        return ResponseEntity.notFound().build();
    }


}
