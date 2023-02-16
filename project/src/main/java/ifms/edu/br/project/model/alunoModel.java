package ifms.edu.br.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class alunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;
    
}
