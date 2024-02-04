package com.orcrist.habittracker.controller;

import com.orcrist.habittracker.model.Activity;
import com.orcrist.habittracker.model.Habit;
import com.orcrist.habittracker.repository.ActivityRepository;
import com.orcrist.habittracker.repository.HabitRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private final ActivityRepository activityRepository;

    private final HabitRepository habitRepository;

    public ActivityController(ActivityRepository activityRepository, HabitRepository habitRepository) {
        this.activityRepository = activityRepository;
        this.habitRepository = habitRepository;
    }

    @PostMapping
    void create(@RequestBody CreateActivityRequest request) {
        Habit habit = this.habitRepository.findById(request.habitId()).orElseThrow();
        Activity activity = new Activity();
        activity.setHabit(habit);
        this.activityRepository.save(activity);
    }
}