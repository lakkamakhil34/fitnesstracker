package com.vcube.fitnesstracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Exercise")
public class Exercise {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long exerciseId;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private String muscleGroup;

	    private String equipment;

	    private String description;

	    public Exercise() {
	    }

	    public Long getExerciseId() {
	        return exerciseId;
	    }

	    public void setExerciseId(Long exerciseId) {
	        this.exerciseId = exerciseId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getMuscleGroup() {
	        return muscleGroup;
	    }

	    public void setMuscleGroup(String muscleGroup) {
	        this.muscleGroup = muscleGroup;
	    }

	    public String getEquipment() {
	        return equipment;
	    }

	    public void setEquipment(String equipment) {
	        this.equipment = equipment;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	
	
}
