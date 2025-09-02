package rc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.test.model.entity.TaskMarker;

import java.util.UUID;

@Repository
public interface TaskMarkerRepository extends JpaRepository<TaskMarker, UUID> {
}
