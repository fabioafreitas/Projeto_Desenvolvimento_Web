package api.orgao.bombeiros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/bombeiros")
public class BombeirosController {

    @Autowired
    private BombeirosDAO bombeirosDAO;

    @GetMapping
    public List<Ocorrencia> getall() {
        return bombeirosDAO.findAll();
    }

    @PostMapping
    public String addOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        bombeirosDAO.save(ocorrencia);
        return "Bombeiros - Ocorrência recebida com sucesso!";
    }


}
