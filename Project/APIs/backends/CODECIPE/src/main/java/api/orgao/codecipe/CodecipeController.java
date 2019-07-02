package api.orgao.codecipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/codecipe")
public class CodecipeController {

    @Autowired
    private CodecipeDAO codecipeDAO;

    @GetMapping
    public List<Ocorrencia> getall() {
        return codecipeDAO.findAll();
    }

    @PostMapping
    public String addOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        codecipeDAO.save(ocorrencia);
        return "CODECIPE - Ocorrência recebida com sucesso!";
    }


}
