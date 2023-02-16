package ifms.edu.br.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class aluno2Controller {


    @GetMapping("/aluno/{nome}")
    public String getMeuNome(@PathVariable String nome)

    { return "meu nome é: " + nome; }
    
}
