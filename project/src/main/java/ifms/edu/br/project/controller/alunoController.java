package ifms.edu.br.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class alunoController {
    
    @GetMapping("/mensagem")
    public String message(){
        return "Hello World";
    }
    
}


