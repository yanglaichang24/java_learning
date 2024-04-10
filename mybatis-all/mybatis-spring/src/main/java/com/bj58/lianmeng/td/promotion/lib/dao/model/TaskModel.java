package com.bj58.lianmeng.td.promotion.lib.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TaskModel implements Serializable {

    private Integer taskId;

    private String title;

    private Date startDate;

    private Date dueDate;

    private Byte status;

    private Byte priority;

    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "TaskModel{" +
                "taskId=" + taskId +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}