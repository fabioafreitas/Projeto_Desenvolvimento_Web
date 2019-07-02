package api.orgao.samu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/samu")
public class SamuController {

    @Autowired
    private SamuDAO samuDAO;

    @GetMapping
    public List<Ocorrencia> getall() {
        return samuDAO.findAll();
    }

    @PostMapping
    public String addOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        samuDAO.save(ocorrencia);
        return "SAMU - Ocorrência recebida com sucesso!";
    }


}
