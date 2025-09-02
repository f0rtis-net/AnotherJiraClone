package rc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.test.model.entity.Epyc;

import java.util.UUID;

@Repository
public interface EpycRepository extends JpaRepository<Epyc, UUID> {
    Epyc findByName(String name);
}
