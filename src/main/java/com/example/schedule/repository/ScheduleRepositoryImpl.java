package com.example.schedule.repository;

import com.example.schedule.entity.Schedule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository{
    @Override
    public Schedule save(Schedule schedule) {
        return null;
    }

    @Override
    public List<Schedule> findAll() {
        return List.of();
    }

    @Override
    public Schedule findById(Long id) {
        return null;
    }

    @Override
    public Schedule update(Schedule schedule) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
