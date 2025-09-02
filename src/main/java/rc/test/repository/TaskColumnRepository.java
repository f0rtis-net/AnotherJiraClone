package rc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskColumnRepository extends JpaRepository<TaskColumnRepository, UUID> {
}
