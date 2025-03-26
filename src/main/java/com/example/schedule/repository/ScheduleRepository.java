package com.example.schedule.repository;

import com.example.schedule.entity.Schedule;

import java.util.List;

public interface ScheduleRepository {

    Schedule save(Schedule schedule);
    List<Schedule> findAll();
    Schedule findById(Long id);
    Schedule update(Schedule schedule);
    void delete(Long id);
}
