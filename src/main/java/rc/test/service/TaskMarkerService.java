package rc.test.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rc.test.repository.TaskMarkerRepository;

@Service
@AllArgsConstructor
public class TaskMarkerService {
    private final TaskMarkerRepository taskMarkerRepository;
}
