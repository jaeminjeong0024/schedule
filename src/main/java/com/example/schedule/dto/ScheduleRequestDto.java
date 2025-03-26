package com.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleRequestDto {
    private String task;
    private String writer;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
