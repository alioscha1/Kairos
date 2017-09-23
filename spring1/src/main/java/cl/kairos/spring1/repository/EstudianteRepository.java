package cl.kairos.spring1.repository;

import cl.kairos.spring1.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
