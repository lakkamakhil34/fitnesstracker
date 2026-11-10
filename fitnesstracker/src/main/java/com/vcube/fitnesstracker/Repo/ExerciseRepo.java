package com.vcube.fitnesstracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.fitnesstracker.model.Exercise;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

}
