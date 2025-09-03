package rc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.test.repository.TaskMarkerRepository;

@Service
public class TaskMarkerService {
    private final TaskMarkerRepository taskMarkerRepository;

    @Autowired
    public TaskMarkerService(TaskMarkerRepository taskMarkerRepository) {
        this.taskMarkerRepository = taskMarkerRepository;
    }
}
