package com.valadao_davi.todolist.dto;

import com.valadao_davi.todolist.entities.Priority;
import com.valadao_davi.todolist.entities.Task;

public class TaskUpdateDTO {

    private String nameTask;
    private Priority priority;
    private Double timeTask;

    public TaskUpdateDTO(){}

    public TaskUpdateDTO(Task entity) {
        nameTask = entity.getNameTask();
        priority = entity.getPriority();
        timeTask = entity.getTimeTask();
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Double getTimeTask() {
        return timeTask;
    }

    public void setTimeTask(Double timeTask) {
        this.timeTask = timeTask;
    }
}
