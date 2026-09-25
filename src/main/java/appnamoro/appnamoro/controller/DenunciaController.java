package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Denuncia;
import appnamoro.appnamoro.enuns.Status;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/denuncia")
public class DenunciaController {

    private List<Denuncia> listaDenuncia = new ArrayList<>();

    private Long proximoId = 1L;

@PostMapping
    public Denuncia salvarDenuncia (@RequestBody Denuncia novaDenuncia){
        novaDenuncia.setIdDenuncia(proximoId++);
        novaDenuncia.setDataDenuncia(LocalDateTime.now());
        novaDenuncia.setStatus(Status.PENDENTE);

        listaDenuncia.add(novaDenuncia);
        return novaDenuncia;
    }
}
