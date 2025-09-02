package rc.test.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rc.test.repository.TaskRepository;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
}
