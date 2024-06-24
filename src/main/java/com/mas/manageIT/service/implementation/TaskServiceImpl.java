package com.mas.manageIT.service.implementation;

import com.mas.manageIT.model.Task;
import com.mas.manageIT.repository.TaskRepository;
import com.mas.manageIT.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public Task add(Task task) {
        return null;
    }

    @Override
    public Task update(long taskId, Task task) {
        return null;
    }
}
