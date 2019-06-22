package api.orgao.bombeiros;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/bombeiros")
public class BombeirosController {

    @GetMapping
    public List<Ocorrencia> getall() {
        return Ocorrencia.ocorrenciaList;
    }

    @PostMapping
    public String addOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        Ocorrencia.ocorrenciaList.add(ocorrencia);
        return "Bombeiros - Ocorrência recebida com sucesso!";
    }


}
