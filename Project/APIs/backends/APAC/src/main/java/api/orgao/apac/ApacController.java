package api.orgao.apac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/apac")
public class ApacController {

    @Autowired
    private ApacDAO apacDAO;

    @GetMapping
    public List<Ocorrencia> getall() {
        return apacDAO.findAll();
    }

    @PostMapping
    public String addOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        apacDAO.save(ocorrencia);
        return "APAC - Ocorrência recebida com sucesso!";
    }


}
