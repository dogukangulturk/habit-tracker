package com.orcrist.habittracker.repository;

import com.orcrist.habittracker.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}