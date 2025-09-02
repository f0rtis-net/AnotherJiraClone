package rc.test.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rc.test.repository.TaskColumnRepository;

@Service
@AllArgsConstructor
public class TaskColumnService {
    private final TaskColumnRepository taskColumnRepository;
}
