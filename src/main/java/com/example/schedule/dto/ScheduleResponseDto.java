package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter

public class ScheduleResponseDto {

    private Long id;
    private String task;
    private String writer;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.task = schedule.getTask();
        this.writer = schedule.getWriter();
        this.password = schedule.getPassword();
        this.createdDate = schedule.getCreatedDate();
        this.updateDate = schedule.getUpdateDate();
    }

}
