package com.example.schedule.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

    @Setter
    private Long id;
    private String task;
    private String writer;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    public Schedule (
            String task,
            String writer,
            String password,
            LocalDateTime createdDate,
            LocalDateTime updateDate
    ) {
        this.task = task;
        this.writer = writer;
        this.password = password;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
