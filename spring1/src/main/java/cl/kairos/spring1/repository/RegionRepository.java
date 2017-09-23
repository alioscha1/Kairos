package cl.kairos.spring1.repository;

import cl.kairos.spring1.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
