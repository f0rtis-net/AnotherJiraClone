package rc.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import rc.test.service.TaskService;

@Controller
@RestController("/tasks")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;
}
