package com.mas.manageIT.mapper;

import com.mas.manageIT.entity.TaskEntity;
import com.mas.manageIT.model.Task;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class TaskMapper {

    private static final Logger logger = LoggerFactory.getLogger(TaskMapper.class);


    public static Task toModel(TaskEntity taskEntity){
        Task task = new Task();

        task.setId(taskEntity.getId());
        task.setDescription(taskEntity.getDescription());
        task.setTaskType(taskEntity.getTaskType());
        task.setStartDate(taskEntity.getStartDate());
        task.setFinishDate(taskEntity.getFinishDate());
        return task;
    }

    public static TaskEntity toEntity(Task task){
        TaskEntity taskEntity = new TaskEntity();

        taskEntity.setId(task.getId());
        taskEntity.setDescription(task.getDescription());
        taskEntity.setTaskType(task.getTaskType());
        taskEntity.setStartDate(task.getStartDate());
        taskEntity.setFinishDate(task.getFinishDate());
        return taskEntity;
    }

}
